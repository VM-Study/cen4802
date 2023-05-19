package example;

public class Main {

    public static final int NUMBER = 10;

    public static void main(String[] args) {
        int fibonacciNumber = fibonacci(NUMBER);
        System.out.println("The " + NUMBER + "th Fibonacci number is: " + fibonacciNumber);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}