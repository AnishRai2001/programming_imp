package programming.string;

public class ConvertCase {
    public static void main(String[] args) {
        String input = "AnishRAI";
        String result = "";

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }

        System.out.println("Converted String: " + result);
    }
}
