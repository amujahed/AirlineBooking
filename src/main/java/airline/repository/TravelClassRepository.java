package airline.repository;

import airline.model.TravelClass;
import airline.model.TravelClassType;

import java.util.ArrayList;
import java.util.List;

public class TravelClassRepository {

    private static int noOfEconomySeats1=195;
    private static double economyBasePrice1=6000;
    private static int noOfBusinessSeats1=35;
    private static double businessBasePrice1=13000;
    private static int noOfFirstSeats1=8;
    private static double firstsBasePrice1=20000;

    private static int noOfEconomySeats2=144;
    private static double economyBasePrice2    =4000;
    private static int noOfBusinessSeats2=0;
    private static double businessBasePrice2=0;
    private static int noOfFirstSeats2=0;
    private static double firstsBasePrice2=0;

    private static int noOfEconomySeats3=152;
    private static double economyBasePrice3=5000;
    private static int noOfBusinessSeats3=20;
    private static double businessBasePrice3=1000;
    private static int noOfFirstSeats3=0;
    private static double firstsBasePrice3=0;


    public static List<TravelClass> getTravelClass1(   )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats1,193,economyBasePrice1));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats1,30,businessBasePrice1));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats1,4,firstsBasePrice1));
        return travelClassList;
    }

    public static List<TravelClass> getTravelClass2(  )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats2,140,economyBasePrice2));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats2,0,businessBasePrice2));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats2,0,firstsBasePrice2));
        return travelClassList;
    }

    public static List<TravelClass> getTravelClass3(  )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats3,100,economyBasePrice3));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats3,10,businessBasePrice3));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats3,0,firstsBasePrice3));
        return travelClassList;
    }


    public static List<TravelClass> getTravelClass1(int noOfEconomyBookedSeats, int noOfBusinessBookedSeats,int noOfFirstBookedSeats   )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats1,193,economyBasePrice1));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats1,30,businessBasePrice1));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats1,4,firstsBasePrice1));
        return travelClassList;
    }

    public static List<TravelClass> getTravelClass2(int noOfEconomyBookedSeats, int noOfBusinessBookedSeats,int noOfFirstBookedSeats   )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats2,140,economyBasePrice2));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats2,0,businessBasePrice2));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats2,0,firstsBasePrice2));
        return travelClassList;
    }

    public static List<TravelClass> getTravelClass3(int noOfEconomyBookedSeats, int noOfBusinessBookedSeats,int noOfFirstBookedSeats   )
    {
        List<TravelClass> travelClassList=new ArrayList<TravelClass>();
        travelClassList.add(new TravelClass(TravelClassType.ECONOMY,noOfEconomySeats3,100,economyBasePrice3));
        travelClassList.add(new TravelClass(TravelClassType.BUSINESS,noOfBusinessSeats3,10,businessBasePrice3));
        travelClassList.add(new TravelClass(TravelClassType.FIRST   ,noOfFirstSeats3,0,firstsBasePrice3));
        return travelClassList;
    }
}
