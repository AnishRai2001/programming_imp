package programingImpl;

public class RemoveBlankSpace {


	    public static void main(String[] args) {
	        String input = "Java   Spring   Boot Microservices";
	        StringBuilder result = new StringBuilder();

	        // Iterate each character and skip spaces
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) != ' ') {
	                result.append(input.charAt(i));
	            }
	        }

	        System.out.println("Original String: " + input);
	        System.out.println("Without Whitespaces: " + result.toString());
	    }
	}


