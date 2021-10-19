package Week6;
import java.util.Scanner;

public class Tutoriel {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez la note 1 : ");
        double note1 = input.nextDouble();
        System.out.print("Entrez la note 2 : ");
        double note2 = input.nextDouble();
        System.out.println("La moyenne est de : " + (moyenne(note1, note2)));

    }
    static double moyenne(double nombre1, double nombre2) {
        return (nombre1 + nombre2) / 2.0;
    }
}
