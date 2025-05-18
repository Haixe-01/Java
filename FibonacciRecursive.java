public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 50; // Find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
