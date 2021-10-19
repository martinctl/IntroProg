import java.util.ArrayList;
import java.util.List;

public class LindsayLeCrack {
    public static void main(String[] args) {
        int[] t = new int[9];
        for (int i = 0; i < 9; i++) {
            t[i] = i;
        }

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }

        for (int i : t) {
            System.out.print(t[i] + " ");
        }

        System.out.println();

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            integers.add(i);
        }

        // 3 façons d'afficher une ArrayList :

        // 1 :
        integers.forEach(i -> System.out.print(i + " "));
        // 2 (je crois pas qu'on peut rajouter de truc là donc c'est à chier:
        integers.forEach(System.out::print);
        // 3 :
        for (Integer i : integers) System.out.print(i + " ");

        System.out.println();







        System.out.printf("Bonjour c'est le numéro %s%n", 10);

        System.out.println(sum(14));
        System.out.println((14*15)/2);
        System.out.println(sumPlusFacile(14));
        System.out.println(sumTresFacile(14));
        

    }

    private static int iter(int n, int acc) {
        if (n == 0) {
            return acc;
        } else return iter(n-1, acc + n);
    }

    private static int sum(int n) {
        return iter(n, 0);
    }

    private static int sumPlusFacile(int n) {
        return n*(n+1)/2;
    }

    private static int sumTresFacile(int n) {
        int a = 0;
        for (int i = 0; i < n+1; i++) {
            a += i;
        }
        return a;
    }
}
