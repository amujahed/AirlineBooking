package airline.model;

import airline.repository.CityRepository;
import airline.util.NullCheck;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Flight {


    private int flightId;
    private String flightNo;
    private String source;
    private String destination;
    private List<String> daysOfWeekList;
    private LocalDate travelDate;
    private Airplane airplane;
    private EconomyClassPricing economyPricing;
    private BusinessClassPricing businessClassPricing;
    private FirstClassPricing firstClassPricing;


    public Flight(int flightId, String flightNo, String source, String destination, List<String> daysOfWeekList, Airplane airplane)
    {
        this.flightId=flightId;
        this.flightNo=flightNo;
        this.source=source;
        this.destination=destination;
        this.daysOfWeekList=daysOfWeekList;
        this.airplane=airplane;
    }

    public EconomyClassPricing getEconomyPricing() {
        return economyPricing;
    }

    public BusinessClassPricing getBusinessClassPricing() {
        return businessClassPricing;
    }

    public FirstClassPricing getFirstClassPricing() {
        return firstClassPricing;
    }


    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {

        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public boolean runBetweenSourceDestination(String source,String destination)
    {
        boolean run=false;
        if(!NullCheck.nullCheckOnString(source) && !NullCheck.nullCheckOnString(destination))
        {
            if(source.equals(getSource()) && destination.equals(getDestination()))
            run=true;
        }

        return  run;
    }
    public boolean runOnTravelDate(LocalDate travelDate)
    {
        boolean run=false;
        LocalDate currentDate=LocalDate.now();
        //if travel date is not provided,do not search the flights using date
        if (travelDate == null)
            run=true;
        //flight search using the travel date applicable only for current and future dates
        else if ( travelDate.equals(currentDate) || travelDate.isAfter(currentDate)) {
            String dayOfWeek = travelDate.getDayOfWeek().toString();
            if (daysOfWeekList.contains(dayOfWeek)) {
                run = true;
                setTravelDate(travelDate);
            }
        }

        return run;
    }
    public boolean isSeatAvailable(TravelClassType travelClassType,int noOfPassengers)
    {
            return getAirplane().isSeatAvailable(travelClassType,noOfPassengers);
    }
    public double getPrice(TravelClassType travelClassType,int noOfPassengers)
    {
        return getAirplane().getBasePrice(travelClassType,noOfPassengers);
    }
    public String getDisplayValueOfSource()
    {
        return CityRepository.getCityForCode(getSource());
    }
    public String getDisplayValueOfDestination()
    {
        return CityRepository.getCityForCode(getDestination());
    }

    public boolean isOpen(TravelClassType travelClassType,LocalDate travelDate)
    {
        boolean isOpen=true;
        LocalDate currentDate=LocalDate.now();
        if(travelClassType.equals(TravelClassType.FIRST) && DAYS.between(currentDate,travelDate) >10)
            isOpen=false;
        return isOpen;
    }
    public double getTotalFare(TravelClassType travelClassType,int noOfPassengers,LocalDate travelDate)
    {
        Pricing pricing;
        if(travelClassType.equals(TravelClassType.ECONOMY))
            pricing=new EconomyClassPricing(TravelClassType.ECONOMY);
        else if(travelClassType.equals(TravelClassType.BUSINESS))
            pricing=new BusinessClassPricing(TravelClassType.BUSINESS);
        else
            pricing=new FirstClassPricing(TravelClassType.FIRST);


        return pricing.getTotalFare(airplane.getTravelClass(travelClassType).getBasePrice(),noOfPassengers,
                pricing.getSurplusFarePercentagePerSeat(this));
    }
}
