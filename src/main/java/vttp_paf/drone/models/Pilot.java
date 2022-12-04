package vttp_paf.drone.models;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Pilot {

    private String pilot_id;
    private String pilot_name;
    private String drone_name;

    public String getPilot_id() {       return pilot_id;       }
    public void setPilot_id(String pilot_id) {       this.pilot_id = pilot_id;       }

    public String getPilot_name() {       return pilot_name;       }
    public void setPilot_name(String pilot_name) {       this.pilot_name = pilot_name;       }

    public String getDrone_name() {       return drone_name;       }
    public void setDrone_name(String drone_name) {       this.drone_name = drone_name;       }

    public static Pilot create(SqlRowSet rs) {

        Pilot pt = new Pilot();

        pt.setPilot_id(rs.getString("id"));
        pt.setPilot_name(rs.getString("pilot_name"));
        pt.setDrone_name(rs.getString("drone_name"));
        
        return pt;
    }

    public static Pilot create(String pilot_name, String drone_name) {

        Pilot pt = new Pilot();

        String pilot_id = UUID.randomUUID().toString().substring(0, 5);
        System.out.printf(">>>> PILOT ID GENERATED: ", pilot_id);
        pt.setPilot_id(pilot_id);
        pt.setPilot_name(pilot_name);
        pt.setDrone_name(drone_name);
        
        return pt;
    }
}
