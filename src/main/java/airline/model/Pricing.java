package airline.model;

public abstract class Pricing {
    private  TravelClassType travelClassType;

    public Pricing (TravelClassType travelClassType)
    {
        this.travelClassType=travelClassType;
    }
    public TravelClassType getTravelClassType() {
        return travelClassType;
    }

    public  void setTravelClassType(TravelClassType travelClassType) {
        this.travelClassType = travelClassType;
    }
    public abstract  int getSurplusFarePercentagePerSeat(Flight flight);

    public  double getTotalFare(Double basePrice,int noOfPassengers,int surplusFarePercentage)
    {
        return (1+0.01*surplusFarePercentage)*basePrice*noOfPassengers;
    }
}
