package airline.repository;

import airline.model.Airplane;

public class AirplaneRepository {

    public  static Airplane getAirplane(String modelNo)
    {
        Airplane airplane=new Airplane("Airbus A321");
        return airplane;
    }
}
