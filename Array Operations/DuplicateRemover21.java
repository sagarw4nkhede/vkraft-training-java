import java.util.*;

public class DuplicateRemover21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        List<Integer> uniqueElements = new ArrayList<>();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num); 
            }
        }
        System.out.println("Unique elements: " + uniqueElements);
        scanner.close();
    }
}
