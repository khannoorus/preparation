package thread.odd.even.printing;

public class SimpleWaitNotify2 {

	static boolean odd = true;
	static int count = 1;
	static int limit = 20;
	static Object ob = "";

	public static void main(String[] args) {
		new Thread(()->{			
			try {
				synchronized (ob) {
					while (count < limit) {
						while (odd) {                             
							ob.wait();                             
						}
						System.out.println(count +  " :: printed by : "+Thread.currentThread().getName());
						count++;
						odd = true;
						ob.notify();
					}
				}
			} catch (InterruptedException e) {}			
		}, "even").start();

		new Thread(()-> {			
			try {
				synchronized (ob) {
					while (count < limit) {
						while (!odd) {                            
							ob.wait();                             
						}
						System.out.println(count + " :: printed by : "+Thread.currentThread().getName());
						count++;
						odd = false;
						ob.notify();
					}
				}
			} catch (InterruptedException e) {}			
		}, "odd").start();
	}

}


