package Week6;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double note;
        ArrayList<Double> notes = new ArrayList<Double>();

        do {
            System.out.println("Entrez une note : (Pour arrêter, entrez -1)");
            note = input.nextDouble();
            if (note != -1) notes.add(note);
        } while (note != -1);

        System.out.println(moyenne(notes));

    }

    static double moyenne (ArrayList<Double> notes) {
        double moyenne = 0;
        for (Double note : notes) {
            moyenne += note;
        }
        return moyenne / notes.size();
    }
}
