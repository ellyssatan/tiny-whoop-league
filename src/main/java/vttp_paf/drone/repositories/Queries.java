package vttp_paf.drone.repositories;

public class Queries {

    public static final String SQL_GET_ALL_RACES = "select id, name, number_of_laps, closing_date from raceDetails";

    public static final String SQL_GET_ALL_PILOTS = "select id, pilot_name, drone_name from pilots";

    public static final String SQL_GET_ALL_LAPS = "select id, race_id, pilot_id, time_s from lapDetails";

    public static final String SQL_INSERT_RACE = """
            insert into raceDetails
                (name, number_of_laps, closing_date)
            values
                (?, ?, ?)
    """;

    public static final String SQL_INSERT_PILOT = """
        insert into pilots
	        (id, pilot_name, drone_name)
        values
	        (?, ?, ?)
    """;

    public static final String SQL_UPDATE_RACE = "";

    public static final String SQL_UPDATE_PILOT = "";

    
}
