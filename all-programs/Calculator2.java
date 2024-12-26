import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println(b != 0 ? "Remainder: " + (a % b) : "Cannot find remainder, division by zero.");

        scanner.close();
    }
}
