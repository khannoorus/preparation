package com.multithreading.examples;

public class NaturalNumberJoin {
	boolean odd;
	int count = 1;
	int MAX = 20;
	static Thread t1 = null;
	static Thread t2 = null;

	public void printOdd() {

			while (count < MAX) {
				while (!odd) {
					try {
						wait();
					} catch (InterruptedException e) {}
				}
				System.out.println(count + " :: printed by : "+Thread.currentThread().getName());
				count++;
				odd = false;
				try {
					t1.join();
				} catch (InterruptedException e) {}
			}
		
	}

	public void printEven() {

			while (count < MAX) {
				while (odd) {
					try {
						wait();
					} catch (InterruptedException e) {}
				}
				System.out.println(count +  " :: printed by : "+Thread.currentThread().getName());
				count++;
				odd = true;
				//notify();
				try {
					t2.join();
				} catch (InterruptedException e) {}
			}
		
	}

	public static void main(String[] args) {

		NaturalNumberJoin oep = new NaturalNumberJoin();
		oep.odd = true;

		 t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				oep.printEven();
			}
		}, "even");
		 t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				oep.printOdd();
			}
		}, "odd");

		t1.start();
		t2.start();
	}
}
