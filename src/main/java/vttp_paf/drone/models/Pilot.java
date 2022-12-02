package vttp_paf.drone.models;

import java.util.LinkedList;
import java.util.List;

public class Pilot {

    private String pilot_id;
    private String pilot_name;
    private String drone_name;
    private List<Race> raceList = new LinkedList<>();

    public String getPilot_id() {       return pilot_id;       }
    public void setPilot_id(String pilot_id) {       this.pilot_id = pilot_id;       }

    public String getPilot_name() {       return pilot_name;       }
    public void setPilot_name(String pilot_name) {       this.pilot_name = pilot_name;       }

    public String getDrone_name() {       return drone_name;       }
    public void setDrone_name(String drone_name) {       this.drone_name = drone_name;       }

    public List<Race> getRaceList() {       return raceList;       }
    public void setRaceList(List<Race> raceList) {       this.raceList = raceList;       }

    
}
