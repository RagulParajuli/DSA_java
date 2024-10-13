import java.util.*;
public class recurssion {
     // Recursive method to calculate factorial
     public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
