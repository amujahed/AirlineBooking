package airline.repository;

import airline.model.Airplane;

public class AirplaneRepository {

    public  static Airplane getAirplane1()
    {

        Airplane airplane=new Airplane("Boeing 777",TravelClassRepository.getTravelClass1());

        return airplane;
    }

    public  static Airplane getAirplane2()
    {

        Airplane airplane=new Airplane("Airbus A319 V2",TravelClassRepository.getTravelClass2());

        return airplane;
    }

    public  static Airplane getAirplane3()
    {

        Airplane airplane=new Airplane("Airbus A321",TravelClassRepository.getTravelClass3());

        return airplane;
    }
}
