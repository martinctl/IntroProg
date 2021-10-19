package Week6;

public class TimeTest {
    public static void main(String[] args) {
        long time = 0;
        long start = System.nanoTime();

        int i = 29712;

        long end = System.nanoTime();

        System.out.println("Le programme s'est executé en : " + (end - start)/1000000000 + "s");

    }
}
