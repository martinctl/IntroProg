package Week3;
import java.util.Scanner;

public class TanteFortunee {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Combien de mois avant que votre tante meurt : ");
        int month = input.nextInt();

        double max = 0;
        double min = 0;
        double moyenne = 0;
        double curentMonth;

        for (int i = 1; i <= month ; ++i) {
            System.out.print("Donnez le montant du mois " + i + " : ");
            curentMonth = input.nextDouble();
            if ((i==1) || (curentMonth <= min)) {
                min = curentMonth;
            }
            if ((i==1) ||(curentMonth >= max)) {
                max = curentMonth;
            }
            moyenne += curentMonth;
        }

        System.out.println();
        if (month > 0) {
            System.out.println("La somme mensuelle moyenne s'élève à " + moyenne/month);
            System.out.println("Le montant minimal est de " + min);
            System.out.println("Le montant maximal est de " + max);
        } else {
            System.out.println("Votre tante est un gros rat");
        }

    }
}
