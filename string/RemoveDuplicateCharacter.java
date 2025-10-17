package programming.string;

public class RemoveDuplicateCharacter {

    public static void removeDuplicates(String str) {
        String result = "";

        System.out.println("Original String: " + str);
        System.out.print("After Removing Duplicates: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeDuplicates("programming");
    }
}
