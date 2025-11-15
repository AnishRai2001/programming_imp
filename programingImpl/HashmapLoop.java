package programingImpl;

import java.util.HashMap;
import java.util.Map;

public class HashmapLoop {
	public static void main(String[] args) {
		  Map<String, Integer> map = new HashMap<>();
	       map.put("Java", 8);
	        map.put("Spring", 5);
	        map.put("Python", 3);
	        
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        	System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	}

}
