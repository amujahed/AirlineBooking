package airline.repository;

import airline.model.TravelClassType;

import java.util.ArrayList;
import java.util.List;

public class TravelClassTypeRepository {

    public static List<TravelClassType> getTravelClassTypeList()
    {
        List<TravelClassType> travelClassTypeList=new ArrayList<TravelClassType>();
        travelClassTypeList.add(TravelClassType.ECONOMY);
        travelClassTypeList.add(TravelClassType.BUSINESS);
        travelClassTypeList.add(TravelClassType.FIRST);
        return travelClassTypeList;
    }
}
