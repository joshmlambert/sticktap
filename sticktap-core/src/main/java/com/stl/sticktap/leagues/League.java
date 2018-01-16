package com.stl.sticktap.leagues;

import com.stl.sticktap.teams.ITeam;
import com.stl.sticktap.teams.Team;

import java.util.Collection;
import java.util.HashSet;

public class League implements ILeague {

    int leagueReputation;
    Collection<ITeam> teams;

    public League() {
    }

    public League(int leagueReputation, Collection<ITeam> teams) {
        this.leagueReputation = leagueReputation;
        this.teams = teams;
    }

    @Override
    public int getLeagueReputation() {
        return leagueReputation;
    }

    @Override
    public Collection<ITeam> getTeams() {
        return teams;
    }


    public static class TestLeague extends League {

        public TestLeague() {
            this.leagueReputation = 5;
            this.teams = generateRandomTeams(12);
        }

        public Collection<ITeam> generateRandomTeams(int numTeams) {

            Collection teams = new HashSet<>();

            for (int i = 0; i < numTeams; i++) {
                teams.add(new Team.RandomTeam());
            }

            return teams;
        }

    }

}
