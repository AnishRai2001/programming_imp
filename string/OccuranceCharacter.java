package programming.string;

public class OccuranceCharacter {
	public static int occuranceCount(String str,char ch) {
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==ch) {
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		
		int result =occuranceCount("Annish",'n');
		System.out.println(result);
		
	
	}

}
