package com.multithreading.examples;

public class SequenceDisplay {

	static Object monitor = new Object();

	static boolean one = true;
	static boolean two = false;
	static boolean three = false;

	public static void main(String[] args) {

		Thread t1 = new Thread(new SequenceDisplayImpl("o1"));
		Thread t2 = new Thread(new SequenceDisplayImpl("o2"));
		Thread t3 = new Thread(new SequenceDisplayImpl("o3"));
		t1.start();
		t2.start();
		t3.start();

	}

	static class SequenceDisplayImpl implements Runnable {

		String threadId;

		SequenceDisplayImpl(String threadId) {
			this.threadId = threadId;
		}

		public void run() {
			print();
		}

		private void print() {
			try {
				while (true) {
					Thread.sleep(500);
					synchronized (monitor) {
						if ("o1".equals(threadId)) {
							if (!one) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = false;
								two = true;
								three = false;
								monitor.notifyAll();
							}
						}
						if ("o2".equals(threadId)) {
							if (!two) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = false;
								two = false;
								three = true;
								monitor.notifyAll();
							}
						}
						if ("o3".equals(threadId)) {
							if (!three) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = true;
								two = false;
								three = false;
								monitor.notifyAll();
							}
						}
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

