package Week5;
import java.util.Scanner;

public class Napoleon {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int borne1, borne2;
        String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis ";
        String prenom = input.nextLine();

        borne1 = noms.indexOf(' ',noms.indexOf(prenom));
        borne2 = noms.indexOf(' ', borne1 + 1);

        for (int i = borne1+1; i <= borne2 ; i++) {
            System.out.print(noms.charAt(i));
        }
    }
}