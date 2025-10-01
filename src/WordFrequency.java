import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static void main(String[] args) {

        QuadraticProbingHashTable<String, Integer> table = new QuadraticProbingHashTable<>();

        try {
            Scanner sc = new Scanner(new File("emma_jane_austen.txt")); // reading the file

            while (sc.hasNext()) {

                String word = sc.next().toLowerCase().replaceAll("[^a-z]", "");

                // assure no empty strings are thre

                if (word.isEmpty()) {
                    continue;
                }

                // If the word is already in the table ++ its count- debug needed heer

                if (table.contains(word)) {
                    int count = table.get(word);  // getting the current count
                    table.insert(word, count + 1);  // updating
                } else {
                    table.insert(word, 1);  // insert word with count 1 if not  in  table
                }
            }

            // Print all word-frequency pairs

            for (Map.Entry<String, Integer> entry : table) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}