import java.util.Scanner;

public class TemperatureConverter6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitFromCelsius = celsius * (9.0 / 5) + 32;

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsiusFromFahrenheit = (fahrenheit - 32) * (5.0 / 9);

        System.out.println("Celsius to Fahrenheit: " + fahrenheitFromCelsius);
        System.out.println("Fahrenheit to Celsius: " + celsiusFromFahrenheit);

        sc.close();
    }
}
