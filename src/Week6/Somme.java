package Week6;
import java.util.Scanner;

public class Somme {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Entrez un nombre : ");
        int n = input.nextInt();
        System.out.println(somme1(n));
        System.out.println(somme2(n));
        System.out.println(somme3(n));
    }
    // Méthode très belle pour calculer une somme (Attention, ne fonctionne pas avec des valeurs négatives)
    static int somme1(int n) {
        if (n == 0) return 0;
        else return (n + somme1(n-1));
    }
    // Formule stupide, mais rapide pour calculer une somme
    static int somme2(int n) {
        return (n*(n+1))/2;
    }
    // Boucle longue, mais claire pour calculer une somme
    static int somme3(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) somme += i;
        return somme;
    }
}
