package airline.model;

import java.time.LocalDate;

public class FlightUI {
    private Flight flight;
    private LocalDate travelDate;

    public FlightUI(Flight flight,LocalDate travelDate)
    {
        this.flight=flight;
        this.travelDate=travelDate;
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
