package airline.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SearchCriteria {

    private String source;
    private String destination;
    private LocalDate travelDate;
    private String travelDateStr;

    public String getTravelDateStr() {
        return travelDateStr;
    }

    public void setTravelDateStr(String travelDateStr) {
        this.travelDateStr = travelDateStr;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        setTravelDate(LocalDate.parse(travelDateStr,formatter));
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
