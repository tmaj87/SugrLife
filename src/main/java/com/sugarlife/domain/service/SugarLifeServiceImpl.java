package com.sugarlife.domain.service;

import com.sugarlife.domain.user.Address;
import com.sugarlife.domain.user.User;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class SugarLifeServiceImpl implements SugarLifeService {
    private static final User USER1 = new User(
            "HandsomePeter",
            "M",
            new GregorianCalendar(1986, 01, 28).getTime(),
            new Address("Poland", "Krakow")
    );

    private static final User USER2 = new User(
            "SexyMarry",
            "M",
            new GregorianCalendar(1999, 05, 30).getTime(),
            new Address("USA", "New York")
    );

    private List<User> users = new ArrayList<>();

    public SugarLifeServiceImpl() {
        users.add(USER1);
        users.add(USER2);
    }

    public User findUserOrNull(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
