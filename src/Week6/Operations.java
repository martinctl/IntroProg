package Week6;
import java.util.Scanner;

public class Operations {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int[] tab = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};

        operations(tab);



    }

    static void afficher(int[] tab) {
        for (int i : tab) System.out.print(i + " ");
        System.out.println();
    }

    static void operations(int[] tab) {
        operation1(tab);
        operation2(tab);
        operation3(tab);
        operation4(tab);
        operation5(tab);
    }

    static void operation1(int[] tab) {
        int n = 0;
        for (int i : tab) if (i == 9) ++n;
        System.out.println("Il y a " + n + " éléments de valeur 9 dans le tableau");
    }

    static void operation2(int[] tab) {
        int n = 0;
        for (int i : tab) if ((i > 4) || (i < 2)) ++n;
        System.out.println("Il y a " + n + " éléments plus grand que 4 ou plus petit que 2");
    }

    static void operation3(int[] tab) {
        int sum = 0;
        for (int i : tab) sum += i;
        System.out.println("La somme des éléments est " + sum);
    }

    static void operation4(int[] tab) {
        double moyenne = 0.0;
        for (int i : tab) moyenne += i;
        System.out.println("La moyenne arithmétique des éléments est " + moyenne/tab.length);
    }

    static void operation5(int[] tab) {
        int highest = 0;
        for (int i : tab) if ((i > highest)) highest = i;
        System.out.println("Le plus grand élément vaut: " + highest);
    }
}
