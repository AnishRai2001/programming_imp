package programming.string;

public class MaxRepeatingChar {
    public static void main(String[] args) {
        String str = "successes";

        char maxChar = findMaxRepeatingChar(str);
        System.out.println("Max repeating character: " + maxChar);
    }

    public static char findMaxRepeatingChar(String str) {
        int[] freq = new int[256]; // for ASCII characters
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int max = -1;
        char result = ' ';

        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }

        return result;
    }
}
