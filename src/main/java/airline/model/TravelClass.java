package airline.model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.WEEKS;

public class TravelClass {
    private TravelClassType travelClassType;
    private int noOfSeats;
    private int noOfBookedSeats;
    private double basePrice;

    public TravelClass(TravelClassType travelClassName,int noOfSeats,int noOfBookedSeats,double basePrice)
    {
        this.travelClassType =travelClassName;
        this.noOfSeats=noOfSeats;
        this.noOfBookedSeats=noOfBookedSeats;
        this.basePrice=basePrice;
    }
    public int getNoOfBookedSeats() {
        return noOfBookedSeats;
    }

    public void setNoOfBookedSeats(int noOfBookedSeats) {
        this.noOfBookedSeats = noOfBookedSeats;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public TravelClassType getTravelClassType() {

        return travelClassType;
    }

    public void setTravelClassType(TravelClassType travelClassType) {
        this.travelClassType = travelClassType;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfAvailableSeats()
    {
        return getNoOfSeats()-getNoOfBookedSeats();
    }
    public boolean isAvailable()
    {
        return getNoOfAvailableSeats() >0;
    }

    public boolean isOpen(LocalDate travelDate)
    {
        boolean isOpen=true;
        LocalDate currentDate=LocalDate.now();
        if(travelClassType.equals(TravelClassType.FIRST))
        {
            if( DAYS.between(currentDate,travelDate) >10)
                isOpen=false;
        }
        else if(travelClassType.equals(TravelClassType.BUSINESS)) {
            if (WEEKS.between(currentDate, travelDate) > 4)
                isOpen = false;
        }
        return isOpen;
    }

}
