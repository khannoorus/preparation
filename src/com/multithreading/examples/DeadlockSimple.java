package com.multithreading.examples;

public class DeadlockSimple {

	public static void main(String[] args) {
		Object ob1 = "noorus";
		Object ob2 = "khan";

		new MyThreads(){
			public void run(){
				synchronized (ob1) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					synchronized (ob2){
						System.out.println("waiting inside ob2");
					}
					
				}
			}
		}.start();

		new MyThreads(){
			public void run(){
				synchronized (ob2) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					synchronized (ob1){
						System.out.println("waiting inside ob1");
					}
				}
			}
		}.start();
	}

}

class MyThreads extends Thread{	
}