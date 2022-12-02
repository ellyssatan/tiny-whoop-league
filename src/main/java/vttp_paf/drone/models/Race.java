package vttp_paf.drone.models;

import java.util.Date;

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

    int numLapFive = NumLap.FIVE.getLevelCode();
    int numLapThree = NumLap.THREE.getLevelCode();
    
    

    private int race_id;
    private String race_name;
    private NumLap number_of_laps;
    // private int number_of_laps;
    private Date closing_date;

    public int getRace_id() {       return race_id;       }
    public void setRace_id(int race_id) {       this.race_id = race_id;       }

    public String getRace_name() {       return race_name;       }
    public void setRace_name(String race_name) {       this.race_name = race_name;       }

    public NumLap getNumber_of_laps() {       return number_of_laps;       }
    public void setNumber_of_laps(NumLap number_of_laps) {       this.number_of_laps = number_of_laps;       }

    public Date getClosing_date() {       return closing_date;       }
    public void setClosing_date(Date closing_date) {       this.closing_date = closing_date;       }

    public static Race create(SqlRowSet rs) {

        Race r = new Race();

        r.setRace_id(rs.getInt("id"));
        r.setRace_name(rs.getString("name"));
        
        if (3 == rs.getInt("number_of_laps")) {
            r.setNumber_of_laps(NumLap.THREE);
        } else {
            r.setNumber_of_laps(NumLap.FIVE);
        };

        r.setClosing_date(rs.getDate("closing_date"));

        return r;
    }
    
}
