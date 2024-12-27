
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the rows you want to print: ");
        int rows = scanner.nextInt();
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(j<rows-i-1){
                    System.out.print(" ");
                }
                else
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
