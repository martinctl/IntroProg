import java.util.Scanner;

public class Exercice8 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Veuillez entrer un réel : ");
        double x = input.nextDouble();

        System.out.println("Expression 1 : " +
                x / (1- Math.exp(x)));
        System.out.println("Expression 2 : " +
                x * Math.log(x) * Math.exp(2/(x-1)));
        System.out.println("Expression 3 : " +
                (-x - Math.sqrt(x*x - 8*x)) / (2 - x));
        System.out.println("Expression 4 : " +
                Math.sqrt((Math.sin(x)-(x/20))*Math.log(Math.sqrt(x*x - 1/x))));

    }
}
