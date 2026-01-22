package se.iths.sara.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import se.iths.sara.springboot.Service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        //HomeController anvönder HomeService via dependency injection
        this.homeService = homeService;
    }

    @GetMapping
    public @ResponseBody String home() {
        return homeService.helloFromService();
    }
}
