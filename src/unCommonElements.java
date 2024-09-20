import java.util.*;

public class unCommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the arrays
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input the elements of the first array
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            set.add(num);
        }

        // Input the elements of the second array
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            // Check if the element is already in the set, if yes, remove it
            if (set.contains(num)) {
                set.remove(num);
            } else {
                // If not in the set, add it
                set.add(num);
            }
        }

        // Print the count of uncommon elements
        System.out.println(set.size());

        scanner.close();
    }
}