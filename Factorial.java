
// Java program to find factorial of given number.
import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {

        int fact = 1;
        if (n == 0) {
            System.out.println("Invalid input!!");
        } else if (n == 1) {
            System.out.println("Factorial of 1 is:  1");
        } else {
            for (int i = 1; i <= n; i++) {

                fact *= i;
            }
        }
        return fact;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find factorial:");
        int num = sc.nextInt();

        sc.close();

        System.out.println(factorial(num));

    }

}
