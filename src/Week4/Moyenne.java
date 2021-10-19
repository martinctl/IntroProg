package Week4;
import java.util.Scanner;

public class Moyenne {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int nombreEtudiants;
        System.out.println("Donnez le nombre d'étudiants");
        nombreEtudiants = input.nextInt();

        double moyenne = 0.0;
        double[] notes = new double[nombreEtudiants];

        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.println("Note étudiant " + i + " : ");
            notes[i] = input.nextDouble();
            moyenne += notes[i];
        }
        //pas fini

    }
}
