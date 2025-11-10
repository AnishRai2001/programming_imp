package programingImpl;

import java.util.HashMap;
import java.util.Map;

public class CountWordMap {

    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            word = word.toLowerCase(); // normalize
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // print after counting
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return wordCount;
    }

    public static void main(String[] args) {
        CountWordMap obj = new CountWordMap();
        obj.countWords("Java is powerful and Java is simple");
    }
}
