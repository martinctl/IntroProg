package Week6;
import java.util.Scanner;

public class MulMat {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();

        afficherMatrice(mat1);
        afficherMatrice(mat2);

        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }

    static double[][] lireMatrice() {
        System.out.print("Combien de ligne a la matrice ? : ");
        int ligne = input.nextInt();
        System.out.print("Combien de colonne a la matrice ? : ");
        int colonne = input.nextInt();
        double[][] matrice = new double[ligne][colonne];
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print("Entrez la valeur de la ligne [" + (i+1) + "] et de la colonne [" + (j+1) + "] : " );
                matrice[i][j] = input.nextDouble();
            }
        }
        return (matrice);
    }

    static double[][] multiplierMatrice(double[][] mat1, double[][] mat2) {
        double[][] result = new double[mat1.length][mat2[0].length];
        double actual = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < mat2.length; k++) {
                    actual += mat1[i][k] * mat2[k][j];
                }
                result[i][j] = actual;
                actual = 0;
            }
        }
        return result;
    }

    static void afficherMatrice(double[][] prod){
        System.out.println("Affichage de la matrice : ");
        for (double[] doubles : prod) {
            for (double aDouble : doubles) {
                System.out.print("| "+ aDouble + " ");
            }
            System.out.print("|");
            System.out.println();
        }

    }
}
