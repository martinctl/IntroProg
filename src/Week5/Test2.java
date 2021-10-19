package Week5;
import java.util.Scanner;

public class Test2 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Entrez votre prénom :");
        String name = input.nextLine();

        System.out.println(name);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        char[] namedecompose = new char[(int)name.length()];

        for (int i = 0; i < name.length(); i++) {
            namedecompose[i] = name.charAt(i);
        }
        for (char c : namedecompose) {
            System.out.print(c);
        }
        System.out.println();

        int[] ascii = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            ascii[i] = (int)namedecompose[i];
        }

        for (int i : ascii) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 0; i < name.length(); i++) {
            namedecompose[i] = (char)ascii[i];
        }

        for (int i : namedecompose) {
            System.out.print(i + ", ");
        }




        
        
    }
}
