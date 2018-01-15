package com.stl.sticktap.leagues;

import com.stl.sticktap.teams.ITeam;

import java.util.Collection;

public interface ILeague {

    int getLeagueReputation();

    Collection<ITeam> getTeams();

    //ILeagueStandings getLeaagueStandings();

}
