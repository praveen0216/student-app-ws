package com.appsdeveloper.app.ws.student.model.base;

import com.appsdeveloper.app.ws.student.model.enums.Gender;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

public class Student {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String fullName;
    @NotNull
    @PositiveOrZero
    private int rollNumber;
    @NotNull
    private int age;
    private List<Address> address;
    @NotNull
    private Gender gender;

}
