package com.session.threadlocal;


public class UsingThreadLocal implements Runnable {
    
    private static final ThreadLocal<User> threadLocal = new ThreadLocal<>();
    private final Integer userId;
    private IdGenRepo idRepo = new IdGenRepo();

    UsingThreadLocal(Integer userId) {
        this.userId = userId;
    }


    @Override
    public void run() {
        String userName = idRepo.getUserNameForUserId(userId);
        threadLocal.set(new User(userName));
        System.out.println("given userId: " + userId + " :::::: " + threadLocal.get());
    }
}
