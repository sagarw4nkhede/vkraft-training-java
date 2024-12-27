// Input an array of integers and find the largest and smallest numbers.
import java.util.Scanner;
public class LargestSmallestNumbers15{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter sieze of the array: ");
        int n= scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]= scanner.nextInt();
        }
        
        System.out.print("Array elements : ");
        for(int i =0;i<n;i++){
            System.out.print("\t"+arr[i]);
        }
        int largest= arr[0];
        int smallest= arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
            if(arr[i]<smallest){
                smallest= arr[i];
            }
        }
        System.out.println("\nLargest number: "+largest);
        System.out.println("Smallest number: "+smallest);
    }
}