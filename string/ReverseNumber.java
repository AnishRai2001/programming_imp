package programming.string;

public class ReverseNumber {
	public static int ReverseNumber(int num) {
	int rev=0;	
	while(num !=0) {
		int digit =num%10;
		rev=rev*10+digit;
		num=num/10;
	}
	return rev;
	}
	public static void main(String[] args) {
        int number = 1234;
        int reversed = ReverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }

}
