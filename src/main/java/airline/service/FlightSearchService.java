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

    public List<Flight> searchFlights(SearchCriteria searchCriteria)
    {
        List<FlightUI> flightUIList=new ArrayList<FlightUI>();
        List<Flight> flightList= FlightRepository.getAllFlights();

        return flightList.stream()
                .filter(flight ->flight.runBetweenSourceDestination(searchCriteria.getSource(),searchCriteria.getDestination()))
                .collect(Collectors.toList());
    }
}
