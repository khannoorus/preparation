package com.multithreading.examples;

public class Deadlock {

	public static void main(String[] args) {
		Object ob1 = "noorus";
		Object ob2 = "khan";

		new MyThread(){
			public void run(){
				synchronized (ob1) {
					System.out.println("Thread... "+Thread.currentThread().getName()+" : "+ob1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					synchronized (ob2){
						System.out.println("Thread... "+Thread.currentThread().getName()+" : "+ob1+ob2);
					}
				}
			}
		}.start();

		new MyThread(){
			public void run(){
				synchronized (ob2) {
					System.out.println("Thread... "+Thread.currentThread().getName()+" : "+ob2);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					synchronized (ob1){
						System.out.println("Thread... "+Thread.currentThread().getName()+" : "+ob1+ob2);
					}
				}
			}
		}.start();
	}

}

class MyThread extends Thread{	
}