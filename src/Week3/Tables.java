package Week3;
import java.util.Scanner;

public class Tables {
    //private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i = 2; i <= 10; ++i) {
            System.out.println("Table de " + i + " :");
            for(int j = 1; j <= 10; ++j){
                System.out.println("    " + j + " x " + i + " = " + i*j);
            }
        }
    }
}
