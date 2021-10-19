import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        char actual;
        for (int i = 0; i < s.length(); i++) {
            actual = s.charAt(i);
            if ((ALPHABET.indexOf(actual) != -1) || (actual == ' ')) {
                aCoder += actual;
            }
        }
        for (int i = 0; i < aCoder.length(); i++) {
            actual = aCoder.charAt(i);
            int i1 = ALPHABET.indexOf(actual) + 4;
            if (i1 > 25) {
                i1 -= 26;
            }
            if (actual != ' ') {
                chaineCodee += ALPHABET.charAt(i1);
            } else {
                chaineCodee += ' ';
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
