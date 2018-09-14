package thread.odd.even.printing;

import java.util.concurrent.Semaphore;

public abstract class SimpleSemaphor {
	static Semaphore evenSemaphore = new Semaphore(0); 
	static Semaphore oddSemaphore = new Semaphore(1);
	
	public static void main(String[] args) {
		Runnable r1 = () -> {
			int even = 2;
				for(int i=0;i<10;i++){
					try {
						evenSemaphore.acquire();
						System.out.println(even+ " :: printed by : "+Thread.currentThread().getName());
						even = even+2;
						oddSemaphore.release();
					} catch (InterruptedException e) {}				
				}
		};

		Runnable r2 = () -> {
			int odd = 1;
			for(int i=0;i<10;i++){
				try {
					oddSemaphore.acquire();
					System.out.println(odd+ " :: printed by : "+Thread.currentThread().getName());
					odd = odd+2;
					evenSemaphore.release();
				} catch (InterruptedException e) {}	
			}
		
		};

		Thread t1 = new Thread(r1, "Even");
		Thread t2 = new Thread(r2, "Odd");
		t1.start();
		t2.start();
	}
	
}
