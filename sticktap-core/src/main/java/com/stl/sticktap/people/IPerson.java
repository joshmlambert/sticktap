package com.stl.sticktap.people;

import java.time.LocalDate;

public interface IPerson {

    String getFirstName();
    String getLastName();
    LocalDate getDOB();

    IAttributes getAttributes();
    IContract getContract();

    Position getPosition();

    int getEnergy();
    int getMorale();

}
