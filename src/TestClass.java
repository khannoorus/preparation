import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class TestClass {
	
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	 throw new IllegalArgumentException("abc");
    }

	 static String electionWinner(String[] votes) {
		 Map<String, Integer> m = new HashMap<>();
		for(String name:votes){
			if(m.containsKey(name)){
				m.put(name, m.get(name)+1);
			}
			else{
				m.put(name, 1);
			}
		}
		Integer maxvote = 0;
		List<String> list = new ArrayList<>();
		for (Entry<String, Integer> entry : m.entrySet())
		{
		    if (entry.getValue() > maxvote)
		    {
		        maxvote = entry.getValue();
		    }
		}
		for(String name:m.keySet()){
			if(m.containsValue(maxvote)){
				list.add(name);
			}
		}
		Collections.sort(list);
		return list.get(list.size());
	}
}

	

