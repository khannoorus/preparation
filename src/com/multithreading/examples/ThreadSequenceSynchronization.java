package com.multithreading.examples;

public class ThreadSequenceSynchronization {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadSequenceSynchronization");
		Object lock = new Object();
		Runnable evenThread = new NumbersPrinter(0, lock);
		Runnable oddThread = new NumbersPrinter(1, lock);
		Thread evenWorker = new Thread(evenThread);
		Thread oddWorker = new Thread(oddThread);
		evenWorker.start();
		oddWorker.start();
	}
}

class NumbersPrinter implements Runnable {
	private int start;
	private Object lock;
	public NumbersPrinter(int start, Object lock) {
		this.start = start;
		this.lock = lock;
	}
	@Override
	public void run() {
		while (start<=20) {			
			System.out.println(start);
			start += 2;
			synchronized (lock) {
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}