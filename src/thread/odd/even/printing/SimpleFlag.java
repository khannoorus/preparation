package thread.odd.even.printing;

public class SimpleFlag {
	
	static boolean flag = true;
	
	public static void main(String[] args) {
		Runnable r1 = () -> {
			int i=1;
			while(i <= 10) {
				if(flag) {
					System.out.println(i + " :: printed by : "+Thread.currentThread().getName());
					i+=2;
					flag = !flag;
				}
			}
		};

		Runnable r2 = () -> {
			int i=2;
			while(i <= 10) {
				if(!flag) {
					System.out.println(i + " :: printed by : "+Thread.currentThread().getName());
					i+=2;
					flag = !flag;
				}
			}
		};

		Thread t1 = new Thread(r1, "Odd");
		Thread t2 = new Thread(r2, "Even");
		t1.start();
		t2.start();
	}
}

