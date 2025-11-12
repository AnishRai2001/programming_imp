package programingImpl;

public class PrimeNumberCheck {
	public static boolean checkPrime(int num) {
		if(num<=1)
			return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		return true;
	}
	  public static void main(String[] args) {
	        int num = 30;
	        
	        if (checkPrime(num))
	            System.out.println(num + " is a Prime Number");
	        else
	            System.out.println(num + " is NOT a Prime Number");

}
}
