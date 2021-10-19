package Week5;
import java.util.Scanner;

public class TriangleDePascal {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int taille;
        do {
            System.out.print("De quel taille voulez vous que le triangle de Pascal soit ? (minimum 1) : ");
            taille = input.nextInt();
            if (taille < 0) System.out.println("Attention, entrez une valeure positive et non nulle");
        } while (taille < 0);

        int[][] pascal = new int[taille][taille];
        pascal[0][0] = 1;

        for (int i = 1; i < taille ; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != 0) pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
                else pascal[i][j] = pascal[i-1][j];
            }
        }

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

    }
}
