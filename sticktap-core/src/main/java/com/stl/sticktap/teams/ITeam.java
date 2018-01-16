package com.stl.sticktap.teams;

import com.stl.sticktap.people.IPerson;

import java.util.Collection;
import java.util.List;

public interface ITeam {

    String getTeamName();

    Collection<IPerson> getRoster();

}
