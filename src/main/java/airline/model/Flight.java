package airline.model;

import airline.util.NullCheck;

import java.time.LocalDate;
import java.util.List;

public class Flight {


    private int flightId;
    private String flightNo;
    private String source;
    private String destination;
    private List<String> daysOfWeekList;
    private Airplane airplane;

    public Flight(int flightId,String flightNo,String source,String destination,List<String> daysOfWeekList,Airplane airplane)
    {
        this.flightId=flightId;
        this.flightNo=flightNo;
        this.source=source;
        this.destination=destination;
        this.daysOfWeekList=daysOfWeekList;
        this.airplane=airplane;
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
        String dayOfWeek=travelDate.getDayOfWeek().toString();
        if(daysOfWeekList.contains(dayOfWeek))
            run=true;
        return run;
    }
}
