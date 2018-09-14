package com.session.threadlocal;

public class Test {

	public static void main(String[] args) {
		/*UsingThreadLocal t1 = new UsingThreadLocal(1);
		UsingThreadLocal t2 = new UsingThreadLocal(2);
		new Thread(t1).start();
		new Thread(t2).start();*/
		
		UsingMap t1 = new UsingMap(1);
		UsingMap t2 = new UsingMap(2);
		new Thread(t1).start();
		new Thread(t2).start();
	}
}
