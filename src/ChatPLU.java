import java.util.*;
import java.io.*;

public class ChatPLU {
    private Map<String, ArrayList<String>> wordMap; // now using two-word keys for E
    private Random random;

    public ChatPLU(String fileName) {
        wordMap = new HashMap<>();
        random = new Random();

        try {
            Scanner scanner = new Scanner(new File(fileName));
            ArrayList<String> words = new ArrayList<>();

            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();

            for (int i = 0; i < words.size() - 2; i++) {
                String key = words.get(i) + " " + words.get(i + 1);
                String next = words.get(i + 2);
                wordMap.putIfAbsent(key, new ArrayList<>());
                wordMap.get(key).add(next);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find file " + fileName);
            e.printStackTrace();
        }
    }

    public void generate(String start1, String start2, int n) {
        if (wordMap.isEmpty() || n <= 0) return;

        String key = start1 + " " + start2;
        System.out.print(start1 + " " + start2);
        int count = 2;

        while (count < n) {
            ArrayList<String> nextWords = wordMap.get(key);
            if (nextWords == null || nextWords.isEmpty()) break;

            String next = nextWords.get(random.nextInt(nextWords.size()));
            System.out.print(" " + next);
            count++;

            // slide window
            String[] parts = key.split(" ");
            key = parts[1] + " " + next;

            // to debbug
            if (count % 15 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
