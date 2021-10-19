class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int nbr = 0;
        int freq = 0;
        int actual;

        for (int i : tab1) {
            actual = 0;
            for (int j = 0; j < tab1.length; j++) {
                if (tab1[j] == i) {
                    actual += 1;
                }
            }
            if (actual > freq) {
                freq = actual;
                nbr = i;
            }
        }

        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(nbr + " (" + freq + " x)");



        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
