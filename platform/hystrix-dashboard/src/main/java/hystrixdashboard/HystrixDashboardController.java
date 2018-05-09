package hystrixdashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HystrixDashboardController {

    @RequestMapping("/")
    public String home(){
        return "forward:/hystrix";
    }
}
