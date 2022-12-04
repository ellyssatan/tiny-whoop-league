package vttp_paf.drone.controllers;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp_paf.drone.models.Pilot;
import vttp_paf.drone.models.Race;
import vttp_paf.drone.repositories.RaceRepository;

@Controller
@RequestMapping
public class RaceController {

    @Autowired
    private RaceRepository rRepo;

    @RequestMapping("/raceList")
    public String raceListPage(Model model) {

        List<Race> races = rRepo.getAllRaces();

        model.addAttribute("races", races);

        return "raceList";
    }

    @RequestMapping("/pilotList")
    public String pilotListPage(Model model) {

        List<Pilot> pilots = rRepo.getAllPilots();

        model.addAttribute("pilots", pilots);

        return "pilotList";
    }

    @RequestMapping("/addRace")
    public String addraceCoursePage() {

        return "addRace";
    }

    @RequestMapping("/pilotList")
    public String listOfPilot(Model model) {
        return "pilotList";
    }

    @PostMapping("/insertRace")
    public String insertRace(@RequestBody MultiValueMap<String, String> form) {

        String name = form.getFirst("name");
        int numLaps = Integer.parseInt(form.getFirst("numLaps"));
        DateTime date = new DateTime(form.getFirst("date"));
        System.out.printf(">>> Name: %s, numlaps: %s, date: %s", name, numLaps, date);

        Race r = Race.create(name, numLaps, date);

        if (rRepo.insertRace(r)) {

            System.out.println(">>>> added race");

        }

        return "index";
    }

    @PostMapping("/insertPilot")
    public String insertPilot(@RequestBody MultiValueMap<String, String> form) {

        String pilotName = form.getFirst("pilotName");
        String droneName = form.getFirst("droneName");

        Pilot p = Pilot.create(pilotName, droneName);

        if (rRepo.insertPilot(p)) {

            System.out.println(">>>> added pilot");

        }

        return "index";
    }
}
