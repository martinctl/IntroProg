import java.util.ArrayList;

class Cloture2 {
    public static void main(String[] args) {
        int[][] carte = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/


        //Vérification des bonnes valeures (seulement 0 & 1)

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if ((carte[i][j] != 0) && (carte[i][j] != 1)) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(carte[i][j]);
                    System.out.print("' trouvée en position [");
                    System.out.print(i); // peut être i+1
                    System.out.print("][");
                    System.out.print(j); // peut être j+1
                    System.out.println("]");
                    return;
                }
            }
        }


        // vérification de la convexité par ligne :

        // on copie la liste pour vérifier la convexité :

        int[][] carte2 = new int[carte.length][carte[0].length];

        for (int i = 0; i < carte.length; i++) {
            System.arraycopy(carte[i], 0, carte2[i], 0, carte[i].length);
        }


        // on crée une boucle qui vérifie s'il reste des 0

        boolean zeros = false;
        boolean encoreDesZeros = false;

        for (int[] ints : carte2) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    zeros = true;
                    break;
                }
            }
            if (zeros) break;
        }

        if (zeros) encoreDesZeros = true;



        int zone = 1;
        boolean newzone = false;

        while (encoreDesZeros) {
            for (int i = 0; i < carte2.length; i++) {
                for (int j = 0; j < carte2[i].length; j++) {
                    if (!newzone && (carte2[i][j] == 0)) {
                        newzone = true;
                        zone += 1;
                        carte2[i][j] = zone;
                    }
                    if (newzone) {
                        for (int k = 0; k < carte2.length; k++) {
                            for (int l = 0; l < carte2[k].length; l++) {
                                if (carte2[k][l] == 0) {
                                    if ((k != 0) && (carte2[k-1][l] == zone)) {
                                        carte2[k][l] = zone;
                                        continue;
                                    } // si la case du dessus = zone, on remplace par zone
                                    if ((k != carte2.length-1) && (carte2[k+1][l] == zone)) {
                                        carte2[k][l] = zone;
                                        continue;
                                    } // same mais en dessous
                                    if ((l != 0) && (carte2[k][l-1] == zone)) {
                                        carte2[k][l] = zone;
                                        continue;
                                    } // same mais a gauche
                                    if ((l != carte2[k].length-1) && (carte2[k][l+1] == zone)) {
                                        carte2[k][l] = zone;
                                    } // same mais a droite
                                }
                            }
                        }
                    }
                }
            }
            newzone = false;

            zeros = false;

            // on revérifie s'il reste des 0 avant de passer à la prochaine valeure
            for (int[] ints : carte2) {
                for (int anInt : ints) {
                    if (anInt == 0) {
                        zeros = true;
                        break;
                    }
                }
                if (zeros) break;
            }
            if (!zeros) encoreDesZeros = false;
        }

        // Affichage de la nouvelle matrice

        // (int[] ints : carte2) {
        //    for (int anInt : ints) {
        //        System.out.print(anInt);
        //    }
        //    System.out.println();
        //}

        //vérification de la convexité :

        boolean exterieur = false;
        boolean entre = false;
        boolean erreur = false;
        boolean arret = false;
        int coo = 0;


        for (int i = 2; i <= zone; i++) {
            for (int[] ints : carte2) {
                if (ints[0] == i) exterieur = true;
                if (ints[ints.length - 1] == i) exterieur = true;
            }
            for (int j = 0; j < carte2[0].length; j++) {
                if (carte2[0][j] == i) exterieur = true;
                if (carte2[carte2.length - 1][j] == i) exterieur = true;

            }
            //System.out.println(i + " = " + ((exterieur) ? "est à l'extérieur" : "est un lac" ));
            if (exterieur) {
                for (int j = 0; j < carte2.length; j++) {
                    for (int k = 0; k < carte2[j].length; k++) {
                        if (carte2[j][k] == 1) {
                            for (int l = k; l < carte2[j].length; l++) {
                                if (carte2[j][l] == i) {
                                    erreur = true;
                                    coo = l;
                                }
                                if ((erreur) && carte2[j][l] == 1) arret = true;
                            }
                            if (arret) {
                                System.out.println("Votre carte du terrain n'a pas le bon format :");
                                System.out.println("bord extérieur entrant trouvé en position [" + j + "][" + coo + "]" );
                                return;
                            }
                            erreur = false;
                        }

                    }
                }
            }

            exterieur = false;
        }




        //on remplace les 0 de l'intérieur par des 1

        boolean finDesZeros = false;
        boolean plusDeZeros = false;

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (carte[i][j] == 1) {
                    finDesZeros = true;
                    plusDeZeros = false;
                }
                if (finDesZeros) {
                    if (carte[i][j] == 0) {
                        if (plusDeZeros) {
                            carte[i][j] = 1;
                        } else {
                            for (int k = j; k < carte[i].length; k++) {
                                if (carte[i][k] == 1) {
                                    plusDeZeros = true;
                                    carte[i][j] = 1;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            finDesZeros = false;
        }


        // calcul du périmètre


        double perimetre = 0.0;

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (j == 0) {
                    if (carte[i][j] == 1) perimetre += 2.5;
                } else {
                    if (carte[i][j] != carte[i][j - 1]){
                        perimetre+= 2.5;
                    }
                }
                if (j == carte[i].length - 1){
                    if (carte[i][j] == 1) perimetre += 2.5;
                }
            }
        }

        System.out.println("Périmètre des lignes " + perimetre);

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (i == 0) {
                    if (carte[i][j] == 1) perimetre += 2.5;
                } else {
                    if (carte[i][j] != carte[i - 1][j]) {
                        perimetre += 2.5;
                    }
                }
                if (i == carte[i].length - 1) {
                    if (carte[i][j] == 1) perimetre += 2.5;
                }
            }
        }
        System.out.print("Il vous faut ");
        System.out.print(perimetre);
        System.out.println(" mètres de clôture pour votre terrain.");


        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
