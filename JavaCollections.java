import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int numberOfStrings = 10;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            list.add(userInput);
            set.add(userInput);
            if (map.containsKey(userInput)) {
                map.put(userInput, map.get(userInput) + 1);
            } else {
                map.put(userInput, 1);
            }
        }
        scanner.close();
        System.out.println("\nList Contains:");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("\nSet Contains:");
        for (String string : set) {
            System.out.println(string);
        }
        
        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }
    }
}
