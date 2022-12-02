package vttp_paf.drone.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Lap {
    
    private int lap_id;
    private int race_id;
    private String pilot_id;
    private double time;

    public int getLap_id() {        return lap_id;        }
    public void setLap_id(int lap_id) {        this.lap_id = lap_id;        }

    public int getRace_id() {        return race_id;        }
    public void setRace_id(int race_id) {        this.race_id = race_id;        }

    public String getPilot_id() {        return pilot_id;        }
    public void setPilot_id(String pilot_id) {        this.pilot_id = pilot_id;        }

    public double getTime() {        return time;        }
    public void setTime(double time) {        this.time = time;        }

    public static Lap create(SqlRowSet rs) {

        Lap lp = new Lap();

        lp.setLap_id(rs.getInt("id"));
        lp.setRace_id(rs.getInt("race_id"));
        lp.setPilot_id(rs.getString("pilot_id"));
        lp.setTime(rs.getDouble("time_s"));

        return lp;
    }
}
