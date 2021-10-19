import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquationDuTroisiemeDegre {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Entrez la valeur de a : ");
        double a = input.nextInt();
        System.out.print("Entrez la valeur de b : ");
        double b = input.nextInt();
        System.out.print("Entrez la valeur de c : ");
        double c = input.nextInt();
        System.out.println("Le polynome est donc de la forme : x^3 + " + a + "x² +" + b + "x + " + c);

        double q = (3*b - a*a)/9;
        double r = (9*a*b - 27*c - 2*a*a*a)/54;
        double d = q*q*q + r*r;
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("d = " + d);

        if (d<0) {
            double teta = Math.acos(r/Math.sqrt((-q)*(-q)*(-q)));
            System.out.println("Il y a trois solutions réelles : ");
            System.out.println("   x1 = " + (2*Math.sqrt(-q)*Math.cos(teta/3) - a/3));
            System.out.println("   x2 = " + (2*Math.sqrt(-q)*Math.cos((teta + 2*(Math.PI))/3) - a/3));
            System.out.println("   x3 = " + (2*Math.sqrt(-q)*Math.cos((teta + 4*(Math.PI))/3) - a/3));
        } else {
            double pS = (r + Math.sqrt(d));
            double pT = (r - Math.sqrt(d));
            double S ,T ;
            if (pS > 0) {
                S = Math.pow((r + Math.sqrt(d)), 1.0/3.0);
            } else {
                S = -(Math.pow(-(r + Math.sqrt(d)), 1.0/3.0));
            }
            if (pT > 0) {
                T = Math.pow((r-Math.sqrt(d)), 1.0/3.0);
            } else {
                T = -(Math.pow(-(r - Math.sqrt(d)), 1.0/3.0));
            }
            System.out.println("T = " + T);
            System.out.println("S = " + S);
            if ((d == 0) && (S+T != 0)) {
                System.out.println("Il y a deux solutions réelles : ");
                System.out.println("   x1 = " + (S+T -a/3));
                System.out.println("   x2 = " + ((-(S+T))/2-a/3));
            } else {
                System.out.println("Il ya une seule solution : ");
                System.out.println("   x = " + (S+T -a/3));
            }
        }




    }
}
