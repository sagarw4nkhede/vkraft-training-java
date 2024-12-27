import java.util.Scanner;

public class ElementSearch18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        int position = -1; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i; 
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + (position + 1));
        } else {
            System.out.println("Element " + target + " not found.");
        }
        sc.close();
    }
}
