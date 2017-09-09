package airline.repository;

import airline.model.Flight;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getAllFlights()
    {

        List<Flight> flightList=new ArrayList<Flight>();

        flightList.add(new Flight(1,"VP_HYD_BLR_1","HYD","BLR",getDaysOfWeek1(),

                AirplaneRepository.getAirplane("Airbus A321")));

        flightList.add(new Flight(2,"VP_HYD_BLR_2","HYD","BLR",getDaysOfWeek2(),
                AirplaneRepository.getAirplane("Airbus A319 V2")));

        flightList.add(new Flight(3,"VP_HYD_CHN_3","HYD","CHN",getDaysOfWeek1(),
                AirplaneRepository.getAirplane("Airbus A321")));

        flightList.add(new Flight(4,"VP_HYD_CHN_4","HYD","CHN",getDaysOfWeek2(),
                AirplaneRepository.getAirplane("Airbus A319 V2")));

        flightList.add(new Flight(5,"VP_BLR_CHN_5","BLR","CHN",getDaysOfWeek3(),
                AirplaneRepository.getAirplane("Airbus A321")));

        flightList.add(new Flight(6,"VP_BLR_CHN_6","BLR","CHN",getDaysOfWeek1(),
                AirplaneRepository.getAirplane("Airbus A321")));

        flightList.add(new Flight(7,"VP_CHN_HYD_7","CHN","HYD",getDaysOfWeek3(),
                AirplaneRepository.getAirplane("Airbus A319 V2")));


        return flightList;

    }
    public static List<String> getDaysOfWeek1()
    {
        List daysOfWeek=new ArrayList();
        daysOfWeek.add(DayOfWeek.MONDAY.toString());
        daysOfWeek.add(DayOfWeek.WEDNESDAY.toString());
        daysOfWeek.add(DayOfWeek.SUNDAY.toString());
        return daysOfWeek;
    }
    public static List<String> getDaysOfWeek2()
    {
        List daysOfWeek=new ArrayList();
        daysOfWeek.add(DayOfWeek.MONDAY.toString());
        daysOfWeek.add(DayOfWeek.TUESDAY.toString());
        daysOfWeek.add(DayOfWeek.FRIDAY.toString());
        return daysOfWeek;
    }
    public static List<String> getDaysOfWeek3()
    {
        List daysOfWeek=new ArrayList();
        daysOfWeek.add(DayOfWeek.TUESDAY.toString());
        daysOfWeek.add(DayOfWeek.WEDNESDAY.toString());
        daysOfWeek.add(DayOfWeek.SUNDAY.toString());
        return daysOfWeek;
    }
}
