import java.util.*;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		int n = s.nextInt();
		String ar =ss.nextLine();
		int x = s.nextInt();
		int[] num = new int[n];

		String[] arr = ar.split(" ");
		for(int i=0;i<n;i++){
			num[i] = Integer.parseInt(arr[i]);
		}
		for(int i=0;i<n;i++){
			if(num[i] == x){
				num[i] = 1;
			}
		}
		int a=0;
		int[] newnum = new int[n];
		for(int i=0;i<n;i++){
			if(num[i] == 1){
				newnum[a] = 1;
				a++;
			}
		}
		int b=n-1;
		for(int i=n-1;i>=0;i--){
			if(num[i] != 1){
				newnum[b] = num[i];
				b--;
			}
		}
		for(int i=0;i<n;i++){			
				System.out.println(newnum[i]);			
		}
		





	}

}
