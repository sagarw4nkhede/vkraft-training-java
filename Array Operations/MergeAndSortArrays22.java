import java.util.Scanner;

public class MergeAndSortArrays22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        int[] mergedArray = new int[n1 + n2];
        int mergedArrayLength=mergedArray.length;
        int k = 0;
        for (int i = 0; i < n1; i++) {
            mergedArray[k++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[k++] = arr2[i];
        }
        for (int i = 0; i < mergedArrayLength - 1; i++) {
            for (int j = i + 1; j < mergedArrayLength; j++) {
                if (mergedArray[i] > mergedArray[j]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }
        System.out.println("Merged and sorted array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
