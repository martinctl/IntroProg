package Week5;
import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez un mot ou une phrase : ");

        String phrase = input.nextLine();
        phrase = phrase.toLowerCase();

        String phraseclean = "";

        for (int i = 0; i < phrase.length(); i++) {
            if(Character.isLetter(phrase.charAt(i))) {
                phraseclean += phrase.charAt(i);
            }
        }

        System.out.println("phraseclean = " + phraseclean);

        boolean valide = true;

        for (int i = 0; i < phraseclean.length(); i++) {
            if (phraseclean.charAt(i) != phraseclean.charAt(phraseclean.length() - i - 1)) {
                valide = false;
                break;
            }
        }

        if (valide) System.out.println("C'est un palindrome");
        else System.out.println("Ce n'est pas un palindrome");




    }
}
