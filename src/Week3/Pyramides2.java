package Week3;
import java.util.Scanner;

public class Pyramides2 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrer le nombre de ligne : ");
        int ligne = input.nextInt();
        int nbr = ligne*2 + 1;
        int n;
        for (int i = 1; i <= ligne; i ++){
            n = (nbr-(i*2-1))/2;
            for (int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = ligne-1; i >= 1; i --){
            n = (nbr-(i*2-1))/2;
            for (int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
