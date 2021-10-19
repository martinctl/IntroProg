package Week5;
import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> Liste = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            System.out.print("Entrez un nombre : ");
            Liste.add(input.nextInt());
        }
        System.out.println();

        for (Integer integer : Liste) {
            System.out.print(integer + ", ");
        }

    }
}
