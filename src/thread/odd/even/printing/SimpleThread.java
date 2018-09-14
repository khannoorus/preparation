package thread.odd.even.printing;

public class SimpleThread {

	public static void main(String[] args) {		
		Object lock = new Object();
		MyThread t1 = new MyThread(1, lock);
		MyThread t2 = new MyThread(0, lock);		
		t1.start();
		t2.start();
	}
}

class MyThread extends Thread {
	private int num;
	private Object lock;
	public MyThread(int num, Object lock) {
		this.num = num;
		this.lock = lock;
	}
	@Override
	public void run() {
		while (num<=20) {			
			System.out.println(num);
			num += 2;
			synchronized (lock) {
				try {
					lock.notify();
					lock.wait();
				} catch (InterruptedException e) {}
			}
		}
	}
}