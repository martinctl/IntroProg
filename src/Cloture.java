import java.util.ArrayList;

class Cloture {
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
         * Completez le programme ?? partir d'ici.
         *******************************************/


        //V??rification des bonnes valeures (seulement 0 & 1)

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if ((carte[i][j] != 0) && (carte[i][j] != 1)) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(carte[i][j]);
                    System.out.print("' trouv??e en position [");
                    System.out.print(i); // peut ??tre i+1
                    System.out.print("][");
                    System.out.print(j); // peut ??tre j+1
                    System.out.println("]");
                    return;
                }
            }
        }


        // v??rification de la convexit?? par ligne :

        // on copie la liste pour v??rifier la convexit?? :

        int[][] carte2 = new int[carte.length][carte[0].length];

        for (int i = 0; i < carte.length; i++) {
            System.arraycopy(carte[i], 0, carte2[i], 0, carte[i].length);
        }


        // on cr??e une boucle qui v??rifie s'il reste des 0

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

            // on rev??rifie s'il reste des 0 avant de passer ?? la prochaine valeure
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



        //v??rification de la convexit?? :

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
            //System.out.println(i + " = " + ((exterieur) ? "est ?? l'ext??rieur" : "est un lac" ));
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
                                System.out.println("bord ext??rieur entrant trouv?? en position [" + j + "][" + coo + "]" );
                                return;
                            }
                            erreur = false;
                        }

                    }
                }
            }

            exterieur = false;
        }




        //on remplace les 0 de l'int??rieur par des 1

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

        for (int[] ints : carte) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }


        // calcul du p??rim??tre


        double perimetre = 0.0;

//        for (int[] ints : carte) {
//            for (int j = 0; j < ints.length-1; j++) {
//                if (ints[j] != ints[j + 1]) perimetre += 2.5;
//            }
//            if (ints[0] == 1) perimetre += 2.5;
//            if (ints[ints.length-1] == 1) perimetre += 2.5;
//        }

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length - 1; j++) {
                if (carte[i][j] != carte[i][j + 1]) perimetre += 2.5;
            }
            if (carte[i][0] == 1) perimetre += 2.5;
            if (carte[i][carte[i].length - 1] == 1) perimetre += 2.5;
        }


        for (int i = 0; i < carte[0].length; i++) {
            for (int j = 0; j < carte.length - 1; j++) {
                if (carte[j][i] != carte[j+1][i]) perimetre += 2.5;
            }
            if (carte[0][i] == 1) perimetre += 2.5;
            if (carte[carte.length-1][i] == 1) perimetre += 2.5;
        }


            System.out.print("Il vous faut ");
            System.out.print(perimetre);
            System.out.println(" m??tres de cl??ture pour votre terrain.");


            /*******************************************
             * Ne rien modifier apr??s cette ligne.
             *******************************************/
    }
}
