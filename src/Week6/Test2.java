package Week6;

public class Test2 {
    public static void main(String[] args) {

        int[] tableau1 = {1,2,3,4,5};
        methode(tableau1);

        for (int i : tableau1) {
            System.out.println(i);
        }
    }
    static void methode(int[] tab) {
        tab[0]= 10;
        tab[1]=9;
    }
}
