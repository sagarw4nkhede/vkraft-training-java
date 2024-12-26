import java.util.Scanner;

public class PasswordValidator7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*\\d.*")) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid. It must be at least 8 characters long and contain both letters (lowercase and uppercase) and numbers.");
        }
        sc.close();
    }
}
