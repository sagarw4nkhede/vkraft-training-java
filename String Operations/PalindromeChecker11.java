import java.util.Scanner;

public class PalindromeChecker11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int start = 0, end = input.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                System.out.println("charachter at start: " + input.charAt(start) + " charachter at end: " + input.charAt(end));
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
}
