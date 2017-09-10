package airline.model;

import java.util.List;
import java.util.stream.Collectors;

public class Airplane {

    private int airplaneId;
    private String modelNo;
    private List<TravelClass> travelClassList;

    public Airplane(String modelNo,List<TravelClass> travelClassList)
    {
        this.modelNo=modelNo;
        this.travelClassList=travelClassList;
    }

    public Airplane(String modelNo)
    {
        this.modelNo=modelNo;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public List<TravelClass> getTravelClassList() {
        return travelClassList;
    }

    public void setTravelClassList(List<TravelClass> travelClassList) {
        this.travelClassList = travelClassList;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getNoOfSeats()
    {
        int noOfSeats=0;
        for(TravelClass travelClass:travelClassList)
        {
            noOfSeats+=travelClass.getNoOfSeats();

        }
        return noOfSeats;
    }
    public int getNoOfBookedSeats()
    {
        int noOfBookedSeats=0;
        for(TravelClass travelClass:travelClassList)
        {
            noOfBookedSeats+=travelClass.getNoOfBookedSeats();

        }
        return noOfBookedSeats;
    }

    public int getNoOfAvailableSeats() {
        int noOfAvailableSeats = 0;
        for (TravelClass travelClass : travelClassList) {
            noOfAvailableSeats += travelClass.getNoOfAvailableSeats();

        }
        return noOfAvailableSeats;

    }
    public TravelClass getTravelClass(TravelClassType travelClassType)
    {
         return getTravelClassList().stream()
                .filter(travelClass -> travelClassType.equals(travelClass.getTravelClassType()))
                .collect(Collectors.toList()).get(0);

    }
    public boolean isSeatAvailable(TravelClassType travelClassType,int noOfPassengers)
    {
        return getTravelClass(travelClassType).getNoOfAvailableSeats() >= noOfPassengers;
    }
    public Double getBasePrice(TravelClassType travelClassType,int noOfPassengers)
    {
        return getTravelClass(travelClassType).getBasePrice()*noOfPassengers;
    }


}
