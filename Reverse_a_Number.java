import java.util.Scanner;

public class Reverse_a_Number {


    static int reverse(int n) {

        int reverse = 0;

        while (n > 0) {
            int last_digit = n % 10;

            reverse = (reverse * 10) + last_digit;

            n /= 10;
        }
        return reverse;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();

        System.out.println(reverse(num));

    }
}
