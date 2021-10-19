import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int k = 0;
        int j;
        for (int i = debut; (i <= fin) ; i++) {
            j = i;
            while (j != 0) {
                if (j % 3 == 0) {
                    j += 4;
                } else if (j % 4 == 0) {
                    j /= 2;
                } else {
                    j -= 1;
                }
                k++;
            }
            System.out.println(i + " -> " + k);
            k = 0;
        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
