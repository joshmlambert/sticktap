package com.stl.sticktap.people;

import java.time.LocalDate;
import java.util.Random;

public class Person implements IPerson {

    private String firstName;
    private String lastName;
    private LocalDate DOB;
    private IAttributes attributes;
    private IContract contract;
    private Position position;
    private int energy = 100;
    private int morale = 100;

    public Person() {
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getDOB() {
        return DOB;
    }

    @Override
    public IAttributes getAttributes() {
        return attributes;
    }

    @Override
    public IContract getContract() {
        return contract;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getMorale() {
        return morale;
    }


    public static class RandomPlayer extends Person {

        private Random random = new Random();

        private String firstName;
        private String lastName;

        //TODO make a resource with list of first and last names

        public RandomPlayer() {
            int rand = random.nextInt(1000);
            this.firstName = "firstName " + rand;
            this.lastName = "lastName " + rand;
        }

        @Override
        public String getFirstName() {
            return firstName;
        }

        @Override
        public String getLastName() {
            return lastName;
        }

    }

}
