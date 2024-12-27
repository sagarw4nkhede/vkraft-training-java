import java.util.Scanner;

public class VoteEligibility9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Are you a citizen of India? (yes/no): ");
        String isCitizenInput = sc.next();
        
        boolean isCitizen = isCitizenInput.equalsIgnoreCase("yes");
        
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}
