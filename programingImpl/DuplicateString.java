package programingImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateString {
	
	public static String duplicateString(String str) {
		String[] words = str.split(" ");
//		
//		List<String>string1=new ArrayList<>();
//		string1.add("anish");
//		string1.add("anish");
//		string1.add("manish");
//		Set<String>withoutDuplicate=new HashSet<>(string1);
//		 return String.join(" ", withoutDuplicate);
		
		List<String> string1 = Arrays.asList("anish", "manish", "anish");
		List<String>l1=string1.stream().distinct().collect(Collectors.toList());

		
		return String.join(" ", l1);
	}
	public static void main(String[] args) {
		 String input = "Java Spring Java Microservice Spring";
		   String result = duplicateString(input);
		   System.out.println("Without Duplicates: " + result);
	}

}
