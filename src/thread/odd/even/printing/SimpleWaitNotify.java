package thread.odd.even.printing;

public class SimpleWaitNotify {
	static Object evencycle="";
	static Object oddcycle="";

	public static void main(String[] args) {		
		Runnable r1 = () -> {
			synchronized (oddcycle) {
				int i = 1;
				while(i <= 10) {
					System.out.println(i + " :: printed by : "+Thread.currentThread().getName());
					i=i+2;
					evencycle.notify();
					try {
						oddcycle.wait();
					} catch (InterruptedException e) {}
				}
			}
		};

		Runnable r2 = () -> {
			int i = 2;
			synchronized (evencycle) {
				while(i <= 10) {
					System.out.println(i + " :: printed by : "+Thread.currentThread().getName());
					i=i+2;
					oddcycle.notify();
					try {
						evencycle.wait();
					} catch (InterruptedException e) {}
				}
			}
		};
		
		

		Thread t1 = new Thread(r1, "Odd");
		Thread t2 = new Thread(r2, "Even");
		
		t1.start();
		
		// makesure evenThread always should get started after oddThread
		try{
			Thread.sleep(1000);
			t2.start();
		}catch(InterruptedException e){}

	}
}

