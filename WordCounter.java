

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String input = "Winsoft Technologies";
        
        Map<String, Integer> wordCounts = new HashMap<>();
      
        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();

            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            } else {
                
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
