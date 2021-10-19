package Week4;
import java.util.Scanner;

public class Scalaire {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int nMax = 10 ;
        int[] v1 = new int[nMax];
        int[] v2 = new int[nMax];
        int n;


        do {
            System.out.print("Entrer la taille des vecteurs : ");
            n = input.nextInt();
            if ((n <= 0) || (n > nMax)) {
                System.out.println("Veuillez entrer une valeure comprise entre 1 et 10");
            }
        } while ((n <= 0) || (n > nMax));

        System.out.println("Entrez les composantes du vecteur a : ");
        for (int i = 0; i<n ; ++i) {
            System.out.print("Entrez la valeur de a(" + i + ") : ");
            v1[i] = input.nextInt();
        }

        System.out.println("Entrez les composantes du vecteur b : ");
        for (int i = 0; i<n ; ++i) {
            System.out.print("Entrez la valeur de b(" + i + ") : ");
            v2[i] = input.nextInt();
        }

        int scalaire = 0;
        for (int i = 0; i<n ; i++) {
            scalaire += v1[i] * v2[i];
        }
        System.out.println("Le produit scalaire de a et b est : " + scalaire);











    }
}
