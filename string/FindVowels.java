package programming.string;

public class FindVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        findVowels(str);
    }

    public static void findVowels(String str) {
        str = str.toLowerCase(); // make it case-insensitive
        String vowels = "";

        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                vowels += c;
            }
        }

        System.out.println("Vowels in the string: " + vowels);
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
