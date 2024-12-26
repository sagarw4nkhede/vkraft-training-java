import java.util.Scanner;

public class CharacterFrequency14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        while (input.length() > 0) {
            char ch = input.charAt(0);
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ch) {
                    count++;
                }
            }
            System.out.println(ch + ": " + count);
            input = input.replace(String.valueOf(ch), "");
            // System.out.println("input: " + input);
        }
        sc.close();
    }
}
