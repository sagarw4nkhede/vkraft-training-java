import java.util.Scanner;

public class TrafficLightSystem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = sc.nextLine().toLowerCase();

        System.out.print("Is there an obstacle? (yes/no): ");
        String obstacleInput = sc.nextLine().toLowerCase();
        boolean isObstacle = obstacleInput.equals("yes");

        if (isObstacle) {
            System.out.println("There's an obstacle! You cannot move.");
        } else {
            switch (lightColor) {
                case "green" -> System.out.println("Green Light: Go!");
                case "yellow" -> System.out.println("Yellow Light: Slow Down!");
                case "red" -> System.out.println("Red Light: Stop!");
                default -> System.out.println("Invalid traffic light color.");
            }
        }
        sc.close();
    }
}
