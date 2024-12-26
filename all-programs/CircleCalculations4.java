import java.util.Scanner;

public class CircleCalculations4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);

        sc.close();
    }
}
