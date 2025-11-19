package programingImpl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AllUniqueCharacter {
	
	public static void main(String[] args) {
		String a="Anishh";
		
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<=a.length()-1;i++) {
			char ch=a.charAt(i);
			set.add(ch);
			
		}
		System.out.println(set);
	}

}
