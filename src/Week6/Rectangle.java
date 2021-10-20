package Week6;
import java.util.Scanner;

public class Rectangle {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double largeur = lireDonnee("largeur");
        double hauteur = lireDonnee("hauteur");

        boolean donneesOk = testerDonnees(largeur, hauteur);

        if (donneesOk) {
            calculer(largeur, hauteur);
        } else {
            afficherErreur();
        }
    }

    static double lireDonnee(String donnee) {
        System.out.println("Entrez la " + donnee);
        return input.nextDouble();
    }

    static boolean testerDonnees(double largeur, double hauteur) {
        return (largeur >= 0) && (hauteur >= 0);
    }

    static void afficherErreur() {System.out.println("Erreur: vous avez introduit une largeur ou une hauteur négative!");}

    static void calculer (double largeur, double hauteur) {
        char answer;
        do {
            System.out.println("Surface ('s/S') ou perimètre ('p/P')?:");
            input.nextLine();
            answer = input.nextLine().charAt(0);
        } while ((answer != 's') && (answer != 'S') && (answer != 'p') && (answer != 'P'));

        if ((answer == 's') || (answer == 'S')) {
            System.out.println("La surface est " + largeur * hauteur + " m²");
        } else {
            System.out.println("Le périmètre est " + (2*largeur + 2*hauteur) + " m");
        }
    }
}
