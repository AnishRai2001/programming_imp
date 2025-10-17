package programming.string;

public class NumberOFWord {
	public static int NumberOfWord(String str) {
		int count =0;
		str=str.trim();
		
		for(int i=0;i<=str.length()-1;i++ ) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count ;
	}
	 public static void main(String[] args) {
	    
	        int result = NumberOfWord("Java is a programming language");
	        System.out.println("Number of words: " + result);
	    }

}
