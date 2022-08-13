package io.pragra.jpareview.entity;

import javax.persistence.EntityManager;

public class UserDAO {

    private EntityManager manager;

    public UserDAO(EntityManager manager) {
        this.manager = manager;
    }
}
