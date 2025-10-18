package programming.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Anish");
		list.add("Manish");
		list.add("Anish");
		
		Set<String>original=new HashSet<>();
		Set<String>duplicate=new HashSet<>();
		
		for(String item:list) {
			if(! original.add(item) ) {
				duplicate.add(item);
				
			}
		}
		System.out.println("Original (Unique) Items: " + original);
        System.out.println("Duplicate Items: " + duplicate);
	}

}
