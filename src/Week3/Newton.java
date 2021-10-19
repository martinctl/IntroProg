package Week3;

import java.util.Scanner;

/**
 * Newton
 *
 * A small utility that computes the square root of a number using newtons algorithm.
 *
 * The formula for the element x(k + 1) is (1/2)*(x(k) + n/x(k))
 *
 * Usually, the algorithm is ended after a certain precision is reached or the result
 * changes very little. To keep this example simple, we will stick to a fixed number
 * of iterations (10 in this example).
 */
public class Newton {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        double value = scanner.nextDouble();
        //initial value x0 = 1
        double x = 1;
        for (int i = 0; i < 10; i++) {
            //calculate next value
            x = (1.0/2) * (x + value / x);
        }

        System.out.println("The square root of " + value + " is " + x);
    }

}
