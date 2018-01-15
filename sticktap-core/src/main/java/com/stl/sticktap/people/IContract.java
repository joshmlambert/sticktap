package com.stl.sticktap.people;

import java.time.LocalDate;

public interface IContract {

    LocalDate getStartDate();
    LocalDate getExpirationDate();

    double getSalary();

}
