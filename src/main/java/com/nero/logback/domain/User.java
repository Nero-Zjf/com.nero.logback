package com.nero.logback.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    private final Logger logger = LoggerFactory.getLogger(User.class);
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        logger.debug("id-" + id + " name-" + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
