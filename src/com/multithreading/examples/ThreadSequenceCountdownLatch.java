package com.multithreading.examples;

import java.util.concurrent.CountDownLatch;

public class ThreadSequenceCountdownLatch {
	public static void main(String[] args){
		try{
			CountDownLatch latch = new CountDownLatch(1);
			Thread even = new NumberPrinter(latch, true);
			Thread odd = new NumberPrinter(latch, false);
			even.start();
			odd.start();
		} catch(Exception e) {}
	}
}

class NumberPrinter extends Thread {
	CountDownLatch latch;
	boolean isEven;

	NumberPrinter(CountDownLatch latch, boolean isEven) {
		this.latch = latch;
		this.isEven = isEven;
	}

	@Override
	public void run() {
		if (isEven) {
			try {
				for (int i = 0; i <= 10; i++) {
					synchronized (latch) {
						System.out.println(" " + 2 * i);
						latch.countDown();
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		} else {
			try {
				latch.await();
				for (int i = 0; i < 10; i++) {
					synchronized (latch) {
						System.out.println(" " + (2 * i + 1));
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}