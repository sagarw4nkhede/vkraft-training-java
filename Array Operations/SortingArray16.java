import java.util.Scanner;

public class SortingArray16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n= scanner.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.print("Elements of the array: ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+arr[i]);
        }

        for(int i= 0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.print("Elements of the array in ascending order: ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+arr[i]);
        }
        for(int i= 0;i<n;i++){
            for(int j= i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.print("Elements of the array in descending order: ");
        for(int i=0;i<n;i++){
            System.out.print("\t"+arr[i]);
        }
    }
    
}
