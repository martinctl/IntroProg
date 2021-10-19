import java.util.Scanner;

public class Degre3 {
    private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
        double a0 = 0.0, a1 = 0.0, a2 = 0.0;
        System.out.print("Entrez a2, puis a1, puis a0 : ");
        a2 = clavier.nextInt();
        a1 = clavier.nextInt();
        a0 = clavier.nextInt();

        double q = (3.0 * a1 - a2*a2) / 9.0;
        double r = (9.0 * a2 * a1 - 27.0 * a0 - 2.0 * a2*a2*a2) / 54.0;
        double delta = q*q*q + r*r;
        double theta, z1, z2, z3;
        if (delta < 0.0) { // test du déterminant
            // cas de trois racines réelles
            theta = Math.acos(r / Math.sqrt(-q * q * q));
            z1 = 2 * Math.sqrt(-q) * Math.cos(theta / 3) - a2 / 3;
            z2 = 2 * Math.sqrt(-q) * Math.cos((theta + 2 * Math.PI) / 3) - a2 / 3;
            z3 = 2 * Math.sqrt(-q) * Math.cos((theta + 4 * Math.PI) / 3) - a2 / 3;
            System.out.println("Trois racines ( " + z1 + " , " + z2
                    + " , " + z3 + " )");
        } else {
            // cas de moins de trois racines réelles
// calcul de s
            double s = r+Math.sqrt(delta);
            if (s < 0.0) { s = -Math.pow(-s, 1.0/3.0); }
            else if (s > 0.0) { s = Math.pow( s, 1.0/3.0); }
// calcul de t
            double t = r-Math.sqrt(delta);
            if (t < 0.0) { t = -Math.pow(-t, 1.0/3.0);}
            else if (t > 0.0) { t = Math.pow( t, 1.0/3.0);}
// calcul des solutions
            z1 = -a2 / 3.0 + s + t;
            if ((delta == 0.0) && (s+t != 0.0)) {
                z2 = -a2 / 3.0 - (s + t) / 2.0;
                System.out.println("Deux racines...");
                System.out.println(" l'une simple : " + z1);
                System.out.println( " l'autre double : " + z2);
                System.out.println("(pour information, delta = "+delta+")");
            } else {
                System.out.println("Une seule racine : " + z1);
            }
        }


        }
}
