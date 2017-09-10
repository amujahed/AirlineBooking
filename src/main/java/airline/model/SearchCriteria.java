package airline.model;

import airline.util.NullCheck;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SearchCriteria {
    private String source;
    private String destination;
    private  LocalDate currentDate=LocalDate.now();
    private LocalDate travelDate=currentDate;
    private String travelDateStr=currentDate.toString();
    private int noOfPassengers=1;
    private TravelClassType travelClassType;

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }




    public TravelClassType getTravelClassType() {
        return travelClassType;
    }

    public void setTravelClassType(TravelClassType travelClassType) {
        this.travelClassType = travelClassType;
    }


    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }



    public String getTravelDateStr() {
        return travelDateStr;
    }

    public void setTravelDateStr(String travelDateStr) {
        this.travelDateStr = travelDateStr;
        if(!NullCheck.nullCheckOnString(travelDateStr)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            setTravelDate(LocalDate.parse(travelDateStr, formatter));
        }
    }



    public LocalDate getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate) {
        this.travelDate = travelDate;
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


}
