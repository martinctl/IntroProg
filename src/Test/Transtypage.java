package Test;

import java.util.Arrays;

class Transtypage {

    public static void main(String[] args) {
        int n1 = 2;
        double r1 = 2.7;

        int n2 = (int)2.7;
        double r2 = 5;

        int n3 = (int) 5.6;
        double r3 = 5.6;

        int n4 = 9;
        double r4 = (double) n4;
        double r5 = (int) r4;

        int n5 = 19 / 4;
        int n6 = (int) (n5 / r5);
        double r6 = 5.0;
        int n7 = (int) (n5 / r5);
        double r7 = 19.0 / r6;

        double r8 = 15.0 / n3;
        double r9 = 19 / 4;
        double r10 = (double) (19 / 4);
        double r11 = (double) 19 / (double) 4;

        System.out.println("n1 = " + n1);
        System.out.println("r1 = " + r1);
        System.out.println("n2 = " + n2);
        System.out.println("r2 = " + r2);
        System.out.println("n3 = " + n3);
        System.out.println("r3 = " + r3);
        System.out.println("n4 = " + n4);
        System.out.println("r4 = " + r4);
        System.out.println("n5 = " + n5);
        System.out.println("r5 = " + r5);
        System.out.println("n6 = " + n6);
        System.out.println("r6 = " + r6);
        System.out.println("n7 = " + n7);
        System.out.println("r7 = " + r7);
        System.out.println("r8 = " + r8);
        System.out.println("r9 = " + r9);
        System.out.println("r10 = " + r10);
        System.out.println("r11 = " + r11);
    }
}

