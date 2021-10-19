import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;
        double vitesse = 0;
        double hauteur = h0;
        double accel;
        accel = g;
        double t = 0;
        double surface = 2.0;

        //.out.printf("%.0f, %.4f, %.4f, %.5f\n",
        //        t, hauteur, vitesse, accel);


        double s = surface / masse;
        boolean sol = true;

        double qf;
        double hf;
        double vf;
        double q;

        boolean son = false;
        boolean accelmax = false;
        boolean parachute = false;



        while (sol) {

            qf = (Math.exp( -s * (t+1 - t0)));
            hf = h0 - (g/s)*(t+1-t0) - ((v0-g/s)/s)*(1-qf);
            vf = ((g/s)*(1-qf) + v0* qf);

            q = Math.exp( -s * (t - t0));
            vitesse = (g/s)*(1-q) + v0*q;
            hauteur = h0 - (g/s)*(t-t0) - ((v0-g/s)/s)*(1-q);
            accel = g - s * vitesse;

            System.out.printf("%.0f, %.4f, %.4f, %.5f\n",
                    t, hauteur, vitesse, accel);

            if (parachute) {
                surface = 25.0;
                s = surface / masse ;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
            }

            ++t;

            if (hf < 0) {
                sol = false;
            }
            if ((vf>=343) && !son) {
                System.out.println("## Felix depasse la vitesse du son");
                son = true;
            }
            //System.out.println("vf = " + (g - s * (vf)));
            if ((g - s * (vf)) < 0.5 && !accelmax && (t>2)) {
                System.out.println("## Felix a atteint sa vitesse maximale");
                accelmax = true;
            }
            if ((hf < 2500) && !parachute) {
                System.out.println("## Felix ouvre son parachute");
                parachute = true;
            }
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
