import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[50];
        int count = 0;

        System.out.println("Enter numbers (up to 50, press Enter without input to stop):");

        // Reading numbers into the array
        while (sc.hasNextInt() && count < 50) {
            numbers[count++] = sc.nextInt();
        }

        // Using a HashMap to count occurrences of each number
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for (int i = 0; i < count; i++) {
            numberCountMap.put(numbers[i], numberCountMap.getOrDefault(numbers[i], 0) + 1);
        }

        // Converting the map to an array of entries
        Map.Entry<Integer, Integer>[] entries = numberCountMap.entrySet().toArray(new Map.Entry[0]);

        // Sorting the entries by the key in descending order
        Arrays.sort(entries, (e1, e2) -> e2.getKey().compareTo(e1.getKey()));

                System.out.println(" N  Count");
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.printf("%2d %5d%n", entry.getKey(), entry.getValue());
        }
    }
}
