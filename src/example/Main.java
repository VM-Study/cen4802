package example;

public class Main {

    /**
     * The index in the Fibonacci
     */
    public static final int NUMBER = 10;

    /**
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        int fibonacciNumber = fibonacci(NUMBER);
        System.out.println("The " + NUMBER + "th Fibonacci number is: " + fibonacciNumber);
    }

    /**
     * @param n The index in the Fibonacci
     * @return The N Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}