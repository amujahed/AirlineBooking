package airline.service;

import airline.model.Flight;
import airline.model.FlightUI;
import airline.model.SearchCriteria;
import airline.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class FlightSearchService {

    public List<FlightUI> searchFlights(SearchCriteria searchCriteria)
    {
        List<FlightUI> flightUIList=new ArrayList<FlightUI>();
        List<Flight> totalFlightList= FlightRepository.getAllFlights();
        List<Flight> flightList=new ArrayList<Flight>();
        flightList= totalFlightList.stream()
                .filter(flight ->flight.runBetweenSourceDestination(searchCriteria.getSource(),searchCriteria.getDestination()))
                .filter(flight ->flight.runOnTravelDate(searchCriteria.getTravelDate()))
                .filter(flight ->flight.isSeatAvailable(searchCriteria.getTravelClassType(),searchCriteria.getNoOfPassengers()))
                .collect(Collectors.toList());

       for(Flight flight:flightList)
       {
           flightUIList.add(new FlightUI(flight,searchCriteria.getTravelDate(),searchCriteria.getNoOfPassengers(),
                   flight.getPrice(searchCriteria.getTravelClassType(),searchCriteria.getNoOfPassengers())));
       }
        return flightUIList;
    }
}
