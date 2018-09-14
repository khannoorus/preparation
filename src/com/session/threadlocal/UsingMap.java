package com.session.threadlocal;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UsingMap implements Runnable {
    final static Map<Integer, User> map = new ConcurrentHashMap<>();
    private final Integer userId;
    private IdGenRepo idRepo = new IdGenRepo();

    UsingMap(Integer userId) {
        this.userId = userId;
    }

    @Override
    public void run() {
        String userName = idRepo.getUserNameForUserId(userId);
        map.put(userId, new User(userName));
        System.out.println("given userId: " + userId + " :::::: " + map.get(userId));
    }
}


