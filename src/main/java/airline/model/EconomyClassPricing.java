package airline.model;

public class EconomyClassPricing extends Pricing{

    public EconomyClassPricing(TravelClassType travelClassType) {
        super(travelClassType);
    }

    @Override
    public  int getSurplusFarePercentagePerSeat(Flight flight) {

       TravelClass travelClass= flight.getAirplane().getTravelClass(TravelClassType.ECONOMY);
       int noOfBookedSeatsPercentage=(travelClass.getNoOfBookedSeats()*100)/travelClass.getNoOfSeats();
       int percentage=0;

       if(noOfBookedSeatsPercentage < 40)
            percentage=0;
       else if (noOfBookedSeatsPercentage < 90)
           percentage=30;
       else
           percentage=60;

        return percentage;
    }

}
