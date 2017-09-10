package airline.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CityRepository {
    private static HashMap citiesMap=new HashMap();

    public static List getCitiesList()
    {
        List citiesList=new ArrayList();
        citiesList.add("HYD");
        citiesList.add("CHN");
        citiesList.add("BLR");
        return citiesList;
    }
    public static HashMap getCititesHashMap()
    {
        citiesMap.put("HYD","Hyderabad");
        citiesMap.put("CHN","Chennai");
        citiesMap.put("BLR","Banglore");
        return citiesMap;
    }
    public static String getCityForCode(String cityCode)
    {
        return (String) citiesMap.get(cityCode);
    }
}
