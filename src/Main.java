public class Main {

    public static void main(String[] args) {

        // Run Task 01
        System.out.println("Task 01:");
        countDown(10);

        // Run Task 02
        System.out.println("\nTask 02:");
        System.out.println("GCD = " + gcd(48, 18));

        // Run Task 03
        System.out.println("\nTask 03:");
        System.out.println("Fibonacci of 6 = " + fib(6));

        // Run Homework 1
        System.out.println("\nHomework 1:");
        helloWorld(5);

        // Run Homework 2
        System.out.println("\nHomework 2:");
        System.out.println("Sum = " + sumMultiplesOf7(1, 30));

        // Run Homework 3
        System.out.println("\nHomework 3:");

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int result = binarySearch(numbers, 50, 0, numbers.length - 1);

        System.out.println("50 found at index: " + result);
    }


    // TASK 01
    // Recursively counts down and prints only even numbers
    public static void countDown(int num) {

        // Base case
        if (num == 0) {
            System.out.println("Blastoff!");
        } else {

            // Print only even numbers
            if (num % 2 == 0) {
                System.out.println(num);
            }

            // Recursive call
            countDown(num - 1);
        }
    }


    // TASK 02
    // Finds the GCD using subtraction instead of %
    public static int gcd(int x, int y) {

        // Base case
        if (x == y) {
            return x;
        }

        // Subtract the smaller number from the larger number
        if (x > y) {
            return gcd(x - y, y);
        } else {
            return gcd(x, y - x);
        }
    }


    // TASK 03
    // Finds a Fibonacci number recursively
    public static int fib(int n) {

        // Base cases
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            // Recursive calls
            return fib(n - 1) + fib(n - 2);
        }
    }


    // HOMEWORK 1
    // Prints Hello World n times recursively
    public static void helloWorld(int n) {

        // Base case
        if (n <= 0) {
            return;
        }

        System.out.println("Hello World");

        // Recursive call
        helloWorld(n - 1);
    }


    // HOMEWORK 2
    // Returns the sum of multiples of 7 between n1 and n2
    public static int sumMultiplesOf7(int n1, int n2) {

        // Base case
        if (n1 > n2) {
            return 0;
        }

        // If n1 is a multiple of 7, add it
        if (n1 % 7 == 0) {
            return n1 + sumMultiplesOf7(n1 + 1, n2);
        }

        // Recursive call to check the next number
        return sumMultiplesOf7(n1 + 1, n2);
    }


    // HOMEWORK 3
    // Implements binary search recursively
    public static int binarySearch(int[] array, int target, int low, int high) {

        // Base case: target was not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int middle = (low + high) / 2;

        // Target was found
        if (array[middle] == target) {
            return middle;
        }

        // Search the left half
        if (target < array[middle]) {
            return binarySearch(array, target, low, middle - 1);
        }

        // Search the right half
        return binarySearch(array, target, middle + 1, high);
    }

}