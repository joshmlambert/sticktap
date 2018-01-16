package com.stl.sticktap.test;

import com.stl.sticktap.leagues.ILeague;
import com.stl.sticktap.leagues.League;
import com.stl.sticktap.people.IPerson;
import com.stl.sticktap.teams.ITeam;
import org.junit.Test;

import java.util.Collection;
import java.util.logging.Logger;

public class LeagueTest {

    public static final Logger LOGGER = Logger.getLogger(LeagueTest.class.getName());

    @Test
    public void testTestLeague() {
        ILeague testLeague = new League.TestLeague();
        Collection<ITeam> teams = testLeague.getTeams();
        for (ITeam team : teams) {
            LOGGER.info(team.getTeamName());
            for (IPerson person : team.getRoster()) {
                LOGGER.info(person.getFirstName() + " " + person.getLastName());
            }
        }

    }

}
