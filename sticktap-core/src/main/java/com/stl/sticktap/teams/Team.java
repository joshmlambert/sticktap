package com.stl.sticktap.teams;

import com.stl.sticktap.people.IPerson;
import com.stl.sticktap.people.Person;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Team implements ITeam {

    private String teamName;
    private Collection<IPerson> roster;

    public Team() {
    }

    public Team(String teamName, Collection<IPerson> roster) {
        this.roster = roster;
    }

    @Override
    public String getTeamName() {
        return teamName;
    }

    @Override
    public Collection<IPerson> getRoster() {
        return roster;
    }


    public static class RandomTeam extends Team {

        private Random random = new Random();

        @Override
        public String getTeamName() {
            int rand = random.nextInt(100);
            return "Team " + rand;
        }

        @Override
        public Collection<IPerson> getRoster() {

            Collection<IPerson> roster = new HashSet<>();

            for (int i = 0; i < 23; i++) {
                roster.add(new Person.RandomPlayer());
            }

            return roster;
        }

    }
}
