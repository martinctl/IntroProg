package Week3;
import java.util.Scanner;

public class PGCD {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3=1;
        int pgcd;

        do {
            System.out.println("Entrez un nombre positif");
            n1 = input.nextInt();
        } while (n1 <= 0);
        do {
            System.out.println("Entrez un nombre positif");
            n2 = input.nextInt();
        } while (n2 <= 0);

        if (n2 > n1){
            int temp ;
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        while (n1 > n2) {
            n3 = n1-n2;
            n1 = n1-n2;
        }
        while (n2 > n1) {
            n3 = n1-n2;
            n1 = n1-n2;
        }
        System.out.println("n3 = " + n3);


    }
}
