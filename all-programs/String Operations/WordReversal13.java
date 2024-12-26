import java.util.Scanner;

public class WordReversal13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int len=words.length;
        String reversedSentence = "";
        for (int i = len - 1; i >= 0; i--) {
            System.out.println("word : " + words[i]);
            reversedSentence += words[i] + " ";
        }
        System.out.println("Reversed sentence: " + reversedSentence.trim());
        sc.close();
    }
}
