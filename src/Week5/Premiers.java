package Week5;
import java.util.Scanner;

public class Premiers {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez les nombres jusqu'à quel nombre vous souhaitez obtenir les nombres premiers : ");
        int n = input.nextInt();
        int premier = 2;
        int nbr = 0;
        boolean prem = false;
        do {
            if ((premier % 2 != 0) || (premier == 2)) {
                int rcarre = (int) Math.sqrt(premier);
                for (int i = 2; i <= rcarre ; i++) {
                    if (premier % i == 0) {
                        prem = false;
                        break;
                    }
                }
                if (prem) {
//                    System.out.println(premier);
                    nbr++;
                }
                prem = true;
            }
            premier++;

        } while (premier <= n);


        System.out.println("Il y a " + (nbr + 1) + " nombres premiers entre 1 et " + n + ".");

    }
}
