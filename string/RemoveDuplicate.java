package programming.string;

public class RemoveDuplicate {
    public static int removeDuplicate(String str, char ch) {
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;  // return the total count
    }

    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int result = removeDuplicate(str, ch);
        System.out.println("Count of '" + ch + "' = " + result);
    }
}
