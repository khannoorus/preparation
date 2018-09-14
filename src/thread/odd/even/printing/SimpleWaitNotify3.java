package thread.odd.even.printing;

public class SimpleWaitNotify3 {

	static boolean odd = true;
	static int count = 1;
	static int limit = 20;
	static Object ob = "";

	public static void main(String[] args) {
		new Thread(()->{
			while (count < limit) {
					while (odd) {}
					System.out.println(count +  " :: printed by : "+Thread.currentThread().getName());
					count++;
					odd = true;
					synchronized (ob) {  //wait and notify should be called inside synchronized context
						ob.notify();
						try {
							ob.wait();
						} catch (InterruptedException e) {}
					}
				}			
		}, "even").start();

		new Thread(()-> { 
			while (count < limit) {
					while (!odd) {}
					System.out.println(count + " :: printed by : "+Thread.currentThread().getName());
					count++;
					odd = false;
						synchronized (ob) {  //wait and notify should be called inside synchronized context
							ob.notify();
							try {
								ob.wait();
							} catch (InterruptedException e) {}
						} 
					}		
		}, "odd").start();
	}

}


