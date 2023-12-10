import java.io.*;
import java.util.*;

public class FileOperation {
    public static void main(String[] args) {
        String csvFilePath = "data.csv";
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            Map<String, Integer> wordFrequencyMap = new HashMap<>();
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(", ");
                for (String word : words) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                    (entry1, entry2) -> entry2.getValue() - entry1.getValue()
            );
            pq.addAll(wordFrequencyMap.entrySet());
            System.out.println("Top 3 Repeated Words:");
            for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
                System.out.println(pq.poll().getKey());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
