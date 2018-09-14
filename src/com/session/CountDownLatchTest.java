package com.session;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);

		Manager manager = new Manager(latch);
		Trainee trainee = new Trainee(latch);

		new Thread(manager).start();
		new Thread(trainee).start();

		Thread.sleep(4000);
	}

}
