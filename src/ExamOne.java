
public class ExamOne {
	public static void main(String[] args) {
		int a=0,k=0,b=5,c=5;
		for(int i=1;i<=3;i++) {
			a=i;k=b;
			for(int j=1;j<=3;j++) {
				System.out.print(a+k);
				k=k+c;
			}
			b=b+5;
			c=c+5;
			System.out.println();
		}
	}
}

/*
6 11 16
12 22 32
18 33 48
*/