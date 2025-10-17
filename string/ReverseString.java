package programming.string;

public class ReverseString {
	
//	public static String reverseString(String str) {
//		
//	String rev="";	
//	for(int i=str.length()-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	}
//	return rev;
//		
//	}
//	public static void main(String[] args) {
//		
//		String reverse=reverseString("Anish");
//		System.out.println(reverse);
//	}
	
public static void main(String[] args) {
	

	String str = "Anish";
	String reversed = new StringBuilder(str).reverse().toString();
	System.out.println(reversed);


}
}
