package com.session.threadlocal;


public class User {
    private final String userName;

    User(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return  "userName= " + userName ;
    }
}
