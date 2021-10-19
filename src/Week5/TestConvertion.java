package Week5;

public class TestConvertion {
    public static void main(String[] args) {
        for (int i = 0; i < 65535; i++) {
            System.out.print("[" + i + " : " + (char)i + "], ");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println("ASHA : \uD800\uDF30");
    }
}
