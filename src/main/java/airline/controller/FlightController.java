package airline.controller;


import airline.model.Flight;
import airline.uimodel.FlightUI;
import airline.model.SearchCriteria;
import airline.repository.CityRepository;
import airline.repository.TravelClassTypeRepository;
import airline.service.FlightSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * Created by rajashrk on 8/8/17.
 */
@Controller
public class FlightController {
    @Autowired
    private FlightSearchService flightSearchService;

    @RequestMapping("/")
    public String welcomeMessage(Model model) {
        model.addAttribute("citiesList", CityRepository.getCitiesList());
        model.addAttribute("citiesMap", CityRepository.getCitiesHashMap());
        model.addAttribute("searchCriteria",new SearchCriteria());
        model.addAttribute("travelClassTypeList", TravelClassTypeRepository.getTravelClassTypeList());
        return "flightSearch";
    }
    @RequestMapping(value="/searchFlights",method= RequestMethod.POST)
    public String searchFlights(@ModelAttribute(value="searchCriteria")SearchCriteria searchCriteria, Model model)
    {
        List<FlightUI> flightUIList=flightSearchService.searchFlights(searchCriteria);
        model.addAttribute("flightSearchResultList",flightUIList);
        model.addAttribute("citiesList", CityRepository.getCitiesList());
        model.addAttribute("citiesMap", CityRepository.getCitiesHashMap());
        model.addAttribute("travelClassTypeList", TravelClassTypeRepository.getTravelClassTypeList());
        return  "flightSearch";
    }

    @RequestMapping("/allFlights")
    public String listAllFlightsDetails(Model model) {
        List<Flight> flightList=flightSearchService.getAllFlights();
        model.addAttribute("flightList",flightList);
        return "flights";
    }
}
