package airline.model.pricing;

import airline.model.Flight;
import airline.model.TravelClassType;
import airline.model.pricing.Pricing;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class FirstClassPricing extends Pricing {
    public FirstClassPricing(TravelClassType travelClassType) {
        super(travelClassType);
    }

    @Override
    public int getSurplusFarePercentagePerSeat(Flight flight) {
        int percentage=0;
        LocalDate currentDate= LocalDate.now();
        long noOfDays=DAYS.between(currentDate,flight.getTravelDate());
        if(noOfDays <= 10)
            percentage= (int) ((10-noOfDays)*10);
        return percentage;
    }
}
