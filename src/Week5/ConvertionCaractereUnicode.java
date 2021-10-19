package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertionCaractereUnicode {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez une phrase : ");
        String message = input.nextLine();

        System.out.println(message);

        ArrayList<Integer> convertionInt = new ArrayList<Integer>();
        for (int i = 0; i < message.length(); i++) {
            convertionInt.add((int)message.charAt(i));
        }

        for (Integer integer : convertionInt) {
            System.out.print(integer + ", ");
        }

        System.out.println();
        System.out.println("Reconvertion : ");
        int current;
        for (int i = 0; i < convertionInt.size(); i++) {
            current = convertionInt.get(i);
            System.out.print((char)current);
        }
    }
}











