package vttp_paf.drone.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp_paf.drone.models.Race;
import vttp_paf.drone.repositories.RaceRepository;

@Controller
@RequestMapping
public class RaceController {

    @RequestMapping("/raceList")
    public String raceListPage() {
        return "raceList";
    }

    @RequestMapping("/raceCourse")
    public String addraceCoursePage() {
        return "raceCourse";
    }

    @RequestMapping("/addPilot")
    public String listOfPilot() {
        return "addPilot";
    }
    
}
