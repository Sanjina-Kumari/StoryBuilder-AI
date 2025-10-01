public class Main {

    public static void main(String[] args) {

      // Testing the  ChatPLU with two-word transitions
        ChatPLU chat = new ChatPLU("emma_jane_austen.txt");

        chat.generate("I", "am", 500); // to get a 500-word random wrsd essay

//        QuadraticProbingHashTable<String, Integer> table = new QuadraticProbingHashTable<>();
//
//        table.insert("hello", 1);
//        table.insert("world", 2);
//        table.insert("hello", 3); // test
//
//        System.out.println("Contains 'hello': " + table.contains("hello"));
//        System.out.println("Get 'hello': " + table.get("hello"));
//        table.print(System.out); // Should show key-value pairs
    }
}






