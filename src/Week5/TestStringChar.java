package Week5;

public class TestStringChar {
    public static void main(String[] args) {
        String message = "Bonjour tout les monde";
        char lettre = 'a';
        String message2 = "Yo les gens";
        message = message2;
        message2 = "Bonjour tout le monde";
        System.out.println("lettre = " + lettre);
        System.out.println("message = " + message);
        System.out.println("message2 = " + message2);

        int[] liste1 = {5, 6, 8};
        int[] liste2 = {1, 2, 3};

        liste1 = liste2;
        for (int i : liste1) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : liste2) {
            System.out.print(i);
        }
        System.out.println();

        liste2[0] = 9;
        liste2[1] = 8;
        liste2[2] = 7;
        for (int i : liste1) {
            System.out.print(i);
        }
        System.out.println();
        for (int i : liste2) {
            System.out.print(i);
        }
        System.out.println();

        int nbr = 2189;
        message2 = message + " sauf toi la-bas " + lettre + nbr;
        System.out.println("message2 = " + message2);



    }
}
