package Week6;
import java.util.Scanner;

public class MatriceInverse {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();

        // Entrée de la matrice par l'utilisateur :
        System.out.println("Matrice entrée : ");
        afficherMatrice(mat1);
        System.out.println();

        // Calcul du temps d'exécution :
        long start = System.nanoTime();

        // Calcul et affichage du déterminant :
        System.out.print("Déterminant de la matrice = ");
        System.out.println(det(mat1) + "\n");

        // Affichage du temps d'exécution :
        long end = System.nanoTime();
        System.out.println("Le programme s'est executé en : " + (end-start)/1000000 + " ms\n");


        System.out.println("Comatrice : ");
        double[][] comatrice = comatrice(mat1);
        afficherMatrice(comatrice);


        System.out.println("\nMatrice inverse :");
        double[][] inverse = inverse(mat1);
        afficherMatrice(inverse);




    }

    /* Fonction permettant d'entrer une matrice aux dimensions entrées par l'utilisateur : */

    static double[][] lireMatrice() {
        // Déclaration des variables importantes :
        boolean demander = true;
        char response;
        int ligne;
        int colonne;
        // Boucle qui vérifie que la matrice est carrée et demande à l'utilisateur s'il est sûr de bien
        // vouloir continuer
        do {
            System.out.print("Combien de ligne a la matrice ? : ");
            ligne = input.nextInt();
            System.out.print("Combien de colonne a la matrice ? : ");
            colonne = input.nextInt();
            input.nextLine();
            if (ligne != colonne) {
                do {
                    System.out.print("Attention, votre matrice n'est pas une matrice carrée ! \n" +
                            "Souhaitez vous tout de même continuer ? (Y or N) : ");
                    response = (input.nextLine()).charAt(0);
                } while ((response != 'Y') && (response != 'N'));
                if (response == 'Y') demander = false;
            } else {
                demander = false;
            }
        } while (demander);

        // Affectation des valeures dans la matrice

        double[][] matrice = new double[ligne][colonne];
        for (int i = 0; i < ligne; i++) {
            for (int j = 0; j < colonne; j++) {
                System.out.print("Entrez la valeur de la ligne [" + (i+1) + "] et de la colonne [" + (j+1) + "] : " );
                matrice[i][j] = input.nextDouble();
            }
        }
        return (matrice);
    }

    /*Fonction qui permet d'afficher une matrice de taille N x M : */

    static void afficherMatrice(double[][] prod){
//        System.out.println("Affichage de la matrice : ");
        for (double[] doubles : prod) {
            for (double aDouble : doubles) {
                System.out.print("| "+ aDouble + " ");
            }
            System.out.print("|");
            System.out.println();
        }

    }



    /* Méthode qui permet de calculer le déterminant d'une matrice N x N :
    * Elle se réduit par elle même en matrice 2 x 2 qu'elle multiplie par les coefficient adequats
    * Le déterminant des matrices 2 x 2 est calculé par la méthode "det2" */

    static double det(double[][] matrice) {
        if (matrice.length == 1) return matrice[0][0];
        else if (matrice.length == 2) return det2(matrice);
        else return determinant(matrice);
    }

    static double determinant(double[][] matrice) {
        double det = 0;
        for (int i = 0; i < matrice[0].length; i++) {
            if (matrice.length <= 3) {
                double[][] mat2 = new double[2][2];
                for (int j = 1; j < matrice.length; j++) {
                    for (int k = 0; k < matrice[j].length; k++) {
                        if (k < i) {
                            mat2[j-1][k] = matrice[j][k];
                        } else if (k > i) {
                            mat2[j-1][k-1] = matrice[j][k];
                        }
                    }
                }
                det += matrice[0][i] * det2(mat2) * Math.pow((-1),i);
            } else {
                double[][] matMoinsUn = new double[matrice.length-1][matrice.length-1];
                for (int j = 1; j < matrice.length; j++) {
                    for (int k = 0; k < matrice[j].length; k++) {
                        if (k < i) {
                            matMoinsUn[j-1][k] = matrice[j][k];
                        } else if (k > i) {
                            matMoinsUn[j-1][k-1] = matrice[j][k];
                        }
                    }
                }
                det += matrice[0][i] * determinant(matMoinsUn) * Math.pow((-1),i);
            }
        }
        return det;
    }

     /*La méthode det2 permet de calculer le déterminant d'une matrice 2x2*/

    static double det2(double[][] mat) {
        return (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
    }


    /*On calcul la comatrice d'une matrice N x N :
    * Pour cela, on remplace chaque valeurs de la matrice par le déterminant
    * de la matrice composés lorsque l'on "barre" la ligne et la colonne de ce coefficient*/

    static double[][] comatrice(double[][] matrice) {
        double[][] comatrice = new double[matrice.length][matrice.length];

        // Calcul de la comatrice :
        for (int i = 0; i < comatrice.length; i++) {
            for (int j = 0; j < comatrice.length; j++) {
                double[][] reduite = new double[comatrice.length-1][comatrice.length-1];
                for (int k = 0; k < comatrice.length; k++) {
                    for (int l = 0; l < comatrice.length; l++) {
                        if (k > i) {
                            if (l > j) {
                                reduite[k-1][l-1] = matrice[k][l];
                            } else if (l < j) {
                                reduite[k-1][l] = matrice[k][l];
                            }
                        } else if (k < i) {
                            if (l > j) {
                                reduite[k][l-1] = matrice[k][l];
                            } else if (l < j){
                                reduite[k][l] = matrice[k][l];
                            }
                        }
                    }
                }
                comatrice[i][j] = det(reduite) * Math.pow((-1),(i+j));
            }
        }
        return comatrice;
    }


    /*Cette méthode permet de calculer l'inverse d'une matrice :
    * Pour cela on utilise la formule de la matrice inverse : 1/det * com(A)^t
    * On fait appel dans cette méthode à la méthode comatrice et à la méthode det*/

    static double[][] inverse(double[][] matrice) {

        // Calcul du déterminant de la matrice N x N
        double det = det(matrice);

        // Définition des différentes matrices de dimension identique :
        double[][] inverse = new double[matrice.length][matrice[0].length];

        // Calcul de la comatrice :

        double[][] comatrice = comatrice(matrice);

        // Calcul de la transposée de la comatrice multiplié par l'inverse du déterminant :
        for (int i = 0; i < comatrice.length; i++) {
            for (int j = 0; j < comatrice[i].length; j++) {
                inverse[j][i] = comatrice[i][j] * (1/det);
            }
        }

        return inverse;
    }


    /*Multiplication de deux matrices :
    * Attention ! : Ne vérifie pas la possibilité de multiplier deux matrices
    *
    * Pour vérifier, il est possible d'utiliser le code suivant :
    *
    * if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
     */

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
}
