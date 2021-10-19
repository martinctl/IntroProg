package Week4;
import java.util.Scanner;

public class MulMat {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Saisie de la 1ère matrice :");
        System.out.print("Entrez le nombre de lignes : ");
        int ligne1 = input.nextInt();
        System.out.print("Entrez le nombre de colonnes : ");
        int colonne1 = input.nextInt();
        double[][] mat1 = new double[ligne1][colonne1];
        for (int i = 0; i < ligne1; i++) {
            for (int j = 0; j < colonne1; j++) {
                System.out.print("M["+(i+1)+","+(j+1)+"] = ");
                mat1[i][j] = input.nextDouble();
            }
        }

        System.out.println("Saisie de la 2eme matrice :");
        int ligne2;
        do {System.out.print("Entrez le nombre de lignes : ");
            ligne2 = input.nextInt();
            if (ligne2 != colonne1) {
                System.out.println("Attention ! Le nombre de ligne doit être " +
                        "identique au nombre de colonne de la première matrice");
            }
        } while (ligne2 != colonne1);

        System.out.print("Entrez le nombre de colonnes : ");
        int colonne2 = input.nextInt();
        double[][] mat2 = new double[ligne2][colonne2];
        for (int i = 0; i < ligne2; i++) {
            for (int j = 0; j < colonne2; j++) {
                System.out.print("M["+(i+1)+","+(j+1)+"] = ");
                mat2[i][j] = input.nextDouble();
            }
        }


        double[][] matriceResultat = new double[ligne1][colonne2];
        System.out.println("Le résultat est : ");
        for (int i = 0; i < ligne1; i++) {
            for (int j = 0; j < colonne2; j++) {
                System.out.print(("aa"));
            }
            System.out.println();
        }








        for (double[] val : mat1) {
            for (double val2 : val) {
                System.out.print(val2 + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        for (double[] val : mat2) {
            for (double val2 : val) {
                System.out.print(val2 + " ");
            }
            System.out.println();
        }



    }
}
