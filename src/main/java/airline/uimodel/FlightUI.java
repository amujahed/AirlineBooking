package airline.uimodel;

import airline.model.Flight;

import java.time.LocalDate;

public class FlightUI {
    private Flight flight;
    private LocalDate travelDate;
    private int noOfPassengers;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private double totalPrice;

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public FlightUI(Flight flight, LocalDate travelDate,int noOfPassengers,double totalPrice)
    {
        this.flight=flight;
        this.travelDate=travelDate;
        this.noOfPassengers=noOfPassengers;
        this.totalPrice=totalPrice;
    }
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
    }
}
