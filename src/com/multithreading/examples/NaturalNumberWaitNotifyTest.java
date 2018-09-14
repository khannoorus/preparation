package com.multithreading.examples;

public class NaturalNumberWaitNotifyTest {

	public static void main(String[] args) {

		EvenOdd ob = new EvenOdd();
		ob.odd = true;

		new Thread(()->{			
				try {
					ob.printEven();
				} catch (InterruptedException e) {}			
		}, "even").start();

		new Thread(()-> {			
				try {
					ob.printOdd();
				} catch (InterruptedException e) {}			
		}, "odd").start();
	}
}

class EvenOdd {

	boolean odd;
	int count = 1;
	int MAX = 20;

	public void printOdd() throws InterruptedException {

		synchronized (this) {
			while (count < MAX) {
				while (!odd) {                            
					wait();                             
				}
				System.out.println(count + " :: printed by : "+Thread.currentThread().getName());
				count++;
				odd = false;
				notify();
			}
		}
	}

	public void printEven() throws InterruptedException  {

		synchronized (this) {
			while (count < MAX) {
				while (odd) {                             
					wait();                             
				}
				System.out.println(count +  " :: printed by : "+Thread.currentThread().getName());
				count++;
				odd = true;
				notify();
			}
		}
	}
}
