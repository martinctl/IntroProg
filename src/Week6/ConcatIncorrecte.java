package Week6;
import java.util.Scanner;

public class ConcatIncorrecte {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "China Blue";
        System.out.println(s);
        s = concatener(s, " Express");
        System.out.println(s);
    }

    public static String concatener(String s, String s2)
    {
        s +=s2;
        return s;
    }
}
