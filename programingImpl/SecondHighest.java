package programingImpl;

import java.util.Arrays;

public class SecondHighest {
public static void main(String[] args) {
	int [] num= {10,15,77,45,21};
	Arrays.sort(num);
	
	int highest=num[num.length - 1];
	int secondHighest=Integer.MIN_VALUE;
	
	for(int i=num.length-2;i>=0;i--) {
		if(num[i]<highest) {
			secondHighest=num[i];
			break;
			
		}
	}
	 System.out.println("Second Highest Number: " + secondHighest);
}
}
