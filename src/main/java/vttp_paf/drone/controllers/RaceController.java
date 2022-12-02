package vttp_paf.drone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class RaceController {

    @RequestMapping("/raceList")
    public String raceListPage() {
        return "raceList";
    }


    
}
