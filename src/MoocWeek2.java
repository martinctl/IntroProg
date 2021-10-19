import java.util.Scanner;

public class MoocWeek2 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;

        while (a==0) {
            System.out.println("Entrez une valeur non nulle pour a : ");
            a = input.nextDouble();
        }

        System.out.println("Entrez une valeur pour b : ");
        b = input.nextDouble();
        System.out.println("Entrez une valeur pour c : ");
        c = input.nextDouble();
        double delta = b * b - 4.0 * a * c;

        if (delta < 0) {
            System.out.println("Il n'y a pas de solution dans les réels.");
        } else if (delta > 0) {
            double s1 = (-b - Math.sqrt(delta))/(2*a);
            double s2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("Il y a deux solutions : x1 = " + s1 + " et x2 = " + s2);
        } else {
            double s = -b / 2 * a;
            System.out.println("Il y a une solution : x = " + s);
        }



    }
}
