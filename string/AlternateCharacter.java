package programming.string;

public class AlternateCharacter {
    public static void main(String[] args) {
        String input = "Programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) { // skip every other character
            sb.append(input.charAt(i));
        }

        System.out.println(sb.toString()); // Output: "Pormig"
    }
}
