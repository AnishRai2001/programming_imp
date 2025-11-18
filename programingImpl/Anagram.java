package programingImpl;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		if(str1==null || str2==null) {
			return false;
		}
		char [] a=str1.toCharArray();
		char [] b= str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b) ;
			
		}
	
	
	public static void main(String[]args) {
		String a="Anish";
		String b="Ram";
		System.out.println(isAnagram(a, b));
	}

}
