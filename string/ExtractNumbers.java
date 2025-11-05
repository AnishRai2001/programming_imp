package programming.string;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExtractNumbers {
    public static void main(String[] args) {
        String mixed = "abc123 def456 ghi789";
        Scanner sc = new Scanner(mixed);
        List<Integer> numbers = new ArrayList<>();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            } else {
                sc.next(); // skip non-integer token
            }
        }

        System.out.println(numbers); // Output: [123, 456, 789]
    }
}
