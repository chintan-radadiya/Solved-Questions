// nth term of fibnacci.

import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n) {

        int nm1 = 0;
        int num = 1;
        int next_term = 0;

        if (n <= 0) {
            System.out.println("Invalid!! Input.");
        } else if (n == 1) {
            System.out.println("Fibonacci term of your input is: 0");
        } else if (n == 2) {
            System.out.println("Fibonacci term of your input is: 1");
        } else {

            for (int i = 1; i <= n; i++) {
            next_term = num + nm1;
            nm1=num;
            num = next_term;                   
            }
        }
        return next_term;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term:");
        int term = sc.nextInt();
        sc.close();

        if(term == 0 || term == 1 ||term == 2){
            fibonacci(term);
        }else{

        int ans = fibonacci(term);
        System.out.println("Fibonacci term is: " + ans);
    }
    }

}
