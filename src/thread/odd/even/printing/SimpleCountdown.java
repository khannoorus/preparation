package thread.odd.even.printing;

import java.util.concurrent.CountDownLatch;

public class SimpleCountdown {
	// CountDownLatch is the Alternative of Join
	static CountDownLatch latch;
	
	public static void main(String[] args) {		
		latch = new CountDownLatch(1);
		Runnable r1 = () -> {
			try {
				for (int i = 0; i <= 10; i++) {
					synchronized (latch) {
						System.out.println(" " + 2 * i+ " :: printed by : "+Thread.currentThread().getName());
						latch.countDown();
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {}
		};

		Runnable r2 = () -> {
			try {
				latch.await();
				for (int i = 0; i < 10; i++) {
					synchronized (latch) {
						System.out.println(" " + (2 * i + 1)+ " :: printed by : "+Thread.currentThread().getName());
						latch.notify();
						if (i < 100)
							latch.wait();
					}
				}
			} catch (InterruptedException e) {}
		};

		Thread t1 = new Thread(r1, "Even");
		Thread t2 = new Thread(r2, "Odd");
		t1.start();
		t2.start();
	}
	
}


/*CountDownLatch is a synchronization aid, introduced in Java 5. 
 * Here the synchronization does not mean restricting access to a critical section. 
 * But rather sequencing actions of different threads. 
 * The type of synchronization achieved through CountDownLatch is similar to that of Join. 
 * Assume that there is a thread "M" which needs to wait for other worker threads "T1", "T2", "T3" to complete its tasks Prior 
 * to Java 1.5, the way this can be done is, M running the following code  
        T1.join();
        T2.join();
        T3.join();   

The above code makes sure that thread M resumes its work after T1, T2, T3 completes its work. T1, T2, T3 can complete their work in any order. 
The same can be achieved through CountDownLatch, where T1,T2, T3 and thread M share same CountDownLatch object.
"M" requests :  countDownLatch.await(); 
where as "T1","T2","T3" does  countDownLatch.countdown(); 
One disadvantage with the join method is that M has to know about T1, T2, T3. If there is a new worker thread T4 added later, 
then M has to be aware of it too. This can be avoided with CountDownLatch. 
After implementation the sequence of action would be [T1,T2,T3](the order of T1,T2,T3 could be anyway) -> [M]*/
