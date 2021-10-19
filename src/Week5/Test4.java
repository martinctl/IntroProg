package Week5;
import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            integers.add(i);
        }
        integers.forEach(System.out::println); // affiche integers

        for (Integer integer : integers) { // affiche integers
            System.out.println(integer);
        }

        int[] entiers = {1, 5, 9, 14};
        for (int caca : entiers) { // affiche entiers
            System.out.println(caca);
        }
    }
}
