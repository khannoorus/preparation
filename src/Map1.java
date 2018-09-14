

import java.util.*;
public class Map1 {
	
public static void main(String[] args) {
	Map<Integer,String> mymap = new HashMap<Integer,String>();
	mymap.put(1, "Riyaz");
	mymap.put(2, "Zishan");
	mymap.put(3, "Noorus");
	mymap.put(4, "Soyba");
	
	System.out.println("mymap Map contains below Key,Value pairs");
	for(Map.Entry m:mymap.entrySet()){
		System.out.println(m.getKey()+" -> "+m.getValue());
	}
	System.out.println("Getting value of key [3]");
	System.out.println(mymap.get(3));
	mymap.remove(2);
	System.out.println("Key[2] and its Value removed ");
	mymap.containsKey(2);
	System.out.println("Checking mymap is emty ?");
	System.out.println(mymap.isEmpty());
    
	System.out.println("Remaining mymap Key,Value pairs are");
	for(Map.Entry m:mymap.entrySet()){
		System.out.println(m.getKey()+" -> "+m.getValue());
	}
	
	System.out.println("mymap keys are: "+mymap.keySet());
	System.out.println("mymap values are: "+mymap.values());
	System.out.println("mymap entry are: "+mymap.entrySet());
}
}
