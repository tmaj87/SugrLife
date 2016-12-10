package com.sugarlife.domain.user;

import java.util.Date;

public class User {
    private final String name;
    private final String sex;
    private final Date dateOfBirth;
    private final Address address;

    public User(String name, String sex, Date dateOfBirth, Address address) {
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }
}
