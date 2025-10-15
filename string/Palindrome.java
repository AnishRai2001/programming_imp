package programming.string;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	String a=sc.next();


 boolean isPalindrome=true;

	for(
	int i = 0, j = a.length()-1;i<j;i++,j--)
	{
		if (a.charAt(i) != a.charAt(j)) {
			System.out.println("not a palindrome");
			isPalindrome=false;
			break;
		}
	}
	if(isPalindrome)
	System.out.println("it is palindrome");
}
}

