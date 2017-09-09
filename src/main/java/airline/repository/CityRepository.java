package airline.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CityRepository {

    public static List getCitiesList()
    {
        List citiesList=new ArrayList();
        citiesList.add("HYD");
        citiesList.add("CHN");
        citiesList.add("BLR");
        return citiesList;
    }
}
