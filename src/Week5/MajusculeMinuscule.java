package Week5;
import java.util.Locale;
import java.util.Scanner;

public class MajusculeMinuscule {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Entrez une lettre en \"majuscule\" ou en \"minuscule\"");
        String sortie = input.nextLine();
        char lettre = sortie.charAt(0);

        if (((int)lettre >= 65) && (((int)lettre <= 90))) {
            System.out.print("Votre lettre en minuscule est : ");
            System.out.println((char)((int)lettre + 32));
        } else if (((int)lettre >= 97) && (((int)lettre <= 122))) {
            System.out.print("Votre lettre en majuscule est : ");
            System.out.println((char)((int)lettre - 32));
        } else {
            System.out.println("Votre caractère n'est pas une lettre");
        }


        System.out.println(sortie.toUpperCase(Locale.ROOT));
        System.out.println(sortie.toUpperCase(Locale.ROOT));
    }
}
