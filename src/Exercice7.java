import java.util.Scanner;

public class Exercice7 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez un nombre décimal : ");
        double n = input.nextDouble();
        if (((n<3)&&(n>=2)) || ((n>0)&&(n<=1)) || ((n>=-10)&&(n<=-2))) {
            System.out.println("x appartient à I");
        } else {
            System.out.println("x n'appartient pas à I");
        }
    }
}
