package airline;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by rajashrk on 8/8/17.
 */
@Controller
public class FlightController {

    @RequestMapping("/")
    public String welcomeMessage() {
        return "flightSearch";
    }


}
