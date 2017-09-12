package airline.model;

import java.time.DayOfWeek;

public class BusinessClassPricing extends Pricing {
    public BusinessClassPricing(TravelClassType travelClassType) {
        super(travelClassType);
    }

    @Override
    public int getSurplusFarePercentagePerSeat(Flight flight) {
        int percentage=0;
        DayOfWeek dayOfTravel= flight.getTravelDate().getDayOfWeek();
        if(dayOfTravel !=null &&
                (dayOfTravel == DayOfWeek.MONDAY || dayOfTravel ==DayOfWeek.FRIDAY || dayOfTravel ==DayOfWeek.SUNDAY) )
            percentage=40;
        return percentage;
    }
}
