package com.multithreading.examples;

import java.util.concurrent.Semaphore;

public class NaturalNumberSemaphore {

	public static void main(String[] args) {
		EvenOddPrinter r1 = new EvenOddPrinter(true);
		Thread even = new Thread(r1);
		EvenOddPrinter r2 = new EvenOddPrinter(false);
		Thread odd = new Thread(r2);
		even.start();
		odd.start();
	}	
}

class EvenOddPrinter implements Runnable{

	boolean isEvenCycle;
	
	//initially evenSemaphore allows permit as zero so that first access should get by oddSemaphore which has initial value as one
	static Semaphore evenSemaphore = new Semaphore(0); 
	static Semaphore oddSemaphore = new Semaphore(1);
	
	public EvenOddPrinter(boolean isEvenCycle) {
		super();
		this.isEvenCycle = isEvenCycle;
	}

	@Override
	public void run() {
		int even = 2;
		int odd = 1;
		
		if(this.isEvenCycle){
			for(int i=0;i<10;i++){
				try {
					evenSemaphore.acquire();
					System.out.println(even);
					even = even+2;
					oddSemaphore.release();
				} catch (InterruptedException e) {}				
			}
		}
		else{
			for(int i=0;i<10;i++){
				try {
					oddSemaphore.acquire();
					System.out.println(odd);
					odd = odd+2;
					evenSemaphore.release();
				} catch (InterruptedException e) {}	
			}
		}
		
	}
	
}