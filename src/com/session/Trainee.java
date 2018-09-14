package com.session;

import java.util.concurrent.CountDownLatch;

public class Trainee implements Runnable {
	 CountDownLatch latch = null;

	    public Trainee(CountDownLatch latch) {
	        this.latch = latch;
	    }

	    public void run() {

	        try {
	        	
	            Thread.sleep(3000);
	            this.latch.countDown();
	            System.out.println("Released by thread-1 as Origination part completed");

	            
	            Thread.sleep(3000);
	            this.latch.countDown();
	            System.out.println("Released by thread-2 as Servicing part completed");

	           
	            Thread.sleep(3000);
	            this.latch.countDown();
	            System.out.println("Released by thread-3 as Knockout part completed");
	            
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
