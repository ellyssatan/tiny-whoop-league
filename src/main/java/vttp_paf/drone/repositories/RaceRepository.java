package vttp_paf.drone.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp_paf.drone.models.Lap;
import vttp_paf.drone.models.Pilot;
import vttp_paf.drone.models.Race;

import static vttp_paf.drone.repositories.Queries.*;

import java.util.LinkedList;
import java.util.List;

@Repository
public class RaceRepository {
    
    @Autowired
    private JdbcTemplate template;

    public List<Race> getAllRaces() {
        
        List<Race> races = new LinkedList<>();

        final SqlRowSet rs = template.queryForRowSet(SQL_GET_ALL_RACES);

        while (rs.next()) {

            races.add(Race.create(rs));
        }

        return races;
    }

    public List<Pilot> getAllPilots() {

        List<Pilot> pilots = new LinkedList<>();

        final SqlRowSet rs = template.queryForRowSet(SQL_GET_ALL_PILOTS);

        while (rs.next()) {

            pilots.add(Pilot.create(rs));
        }

        return pilots;
    }

    public List<Lap> getAllLaps() {
        
        List<Lap> laps = new LinkedList<>();

        final SqlRowSet rs = template.queryForRowSet(SQL_GET_ALL_LAPS);

        while (rs.next()) {

            laps.add(Lap.create(rs));
        }

        return laps;
    }

    public List<Race> updateRace() {
        // SQL_UPDATE_RACE

        return null;

    }

    public List<Race> updatePilot() {
        // SQL_UPDATE_PILOT

        return null;

    }

    public List<Race> insertRace() {
        // SQL_INSERT_RACE

        return null;

    }

    public List<Race> insertPilot() {
        // SQL_INSERT_PILOT

        return null;

    }

}
