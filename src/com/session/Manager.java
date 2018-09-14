package com.session;

import java.util.concurrent.CountDownLatch;

public class Manager implements Runnable {

	CountDownLatch latch = null;

    public Manager(CountDownLatch latch) {
        this.latch = latch;
    }
    
	@Override
	public void run() {
		try {
			System.out.println("Checking for Progress by all thread");
            latch.await();
            System.out.println("Manager Can now assign the US");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        
	}

}
