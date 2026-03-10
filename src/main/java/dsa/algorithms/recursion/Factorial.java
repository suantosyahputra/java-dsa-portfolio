package dsa.algorithms.recursion;

public class Factorial {

    public static int factorial(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);

        System.out.println("factorial of " + n + " = " + result);
    }
}