import java.util.Scanner;

public class VowelConsonantCounter12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = 0, consonantCount = 0;
        input = input.toLowerCase();
        int inputLength = input.length();
        for (int i = 0; i < inputLength; i++) {
            char ch = input.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        sc.close();
    }
}
