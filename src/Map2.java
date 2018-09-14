import java.util.*;	
public class Map2 {

public static void main(String[] args) {
	
	Map<String ,Integer> mymap= new HashMap<String ,Integer>();
	
	System.out.println("Enter your string : ");
	Scanner scr=new Scanner(System.in);
	String input= scr.nextLine();
	
	String[] words = input.split(" ");
	for (int i = words.length-1; i >= 0; i--) {
		System.out.println(words[i]);
	}
}
	
}
