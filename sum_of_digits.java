import java.util.Scanner;

public class sum_of_digits {

    static int sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();

        System.out.println(sumOfDigit(num));;
    }
}
