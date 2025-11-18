package programingImpl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class UniqueCharacter {
	


		public static void main(String[] args) {
			String a="success";
			StringBuilder builder=new StringBuilder();
			
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
for(int i =0;i<a.length();i++) {
	char ch =a.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			}
System.out.print("Unique characters: ");
for(char c:map.keySet()) {
	if(map.get(c)==1) {
		System.out.print(c + " ");
	}
}
			
		}
	}



