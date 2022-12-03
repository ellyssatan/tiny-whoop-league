package vttp_paf.drone.models;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Race {
    
    // enum number_of_laps { THREE, FIVE };
    // public enum NumLap {
    //     //Constants with values
    //     THREE(3),
    //     FIVE(5);

    //     //Instance variable
    //     private int numLap;
    //     //Constructor to initialize the instance variable
    //     NumLap(int numLap) {
    //        this.numLap = numLap;
    //     }
    //  }

    // int numLapFive = NumLap.FIVE.getLevelCode();
    // int numLapThree = NumLap.THREE.getLevelCode();

    private int race_id;
    private String race_name;
    // private NumLap number_of_laps;
    private int number_of_laps;
    private DateTime closing_date;
    private List<Pilot> pilotList = new LinkedList<>();

    public int getRace_id() {       return race_id;       }
    public void setRace_id(int race_id) {       this.race_id = race_id;       }

    public String getRace_name() {       return race_name;       }
    public void setRace_name(String race_name) {       this.race_name = race_name;       }

    public int getNumber_of_laps() {       return number_of_laps;       }
    public void setNumber_of_laps(int number_of_laps) {       this.number_of_laps = number_of_laps;       }

    public DateTime getClosing_date() {       return closing_date;       }
    public void setClosing_date(DateTime closing_date) {       this.closing_date = closing_date;       }

    public List<Pilot> getPilotList() {       return pilotList;       }
    public void setPilotList(List<Pilot> pilotList) {       this.pilotList = pilotList;       }

    public static Race create(SqlRowSet rs) {

        Race r = new Race();

        r.setRace_id(rs.getInt("id"));
        r.setRace_name(rs.getString("name"));
        r.setNumber_of_laps(rs.getInt("number_of_laps"));
        r.setClosing_date(new DateTime(
            DateTimeFormat.forPattern("dd/MM/yyyy")
                    .parseDateTime(rs.getString("closing_date"))));

        return r;
    }

    public static Race create(int race_id, String race_name, int number_of_laps, DateTime closing_date, List<Pilot> pilotList) {

        Race r = new Race();

        r.setRace_name(race_name);
        r.setNumber_of_laps(number_of_laps);
        r.setClosing_date(closing_date);
        r.setPilotList(pilotList);

        return r;
    }

    public static Race create(String race_name, int number_of_laps, DateTime closing_date) {

        Race r = new Race();

        r.setRace_name(race_name);
        r.setNumber_of_laps(number_of_laps);
        r.setClosing_date(closing_date);

        return r;
    }
    
}
