// fibonacci number till nth term.
import java.util.Scanner;

public class Fibonacci2 {

    static void fib(int n){

        int num = 1;
        int nm1 = 0;
        
        System.out.print("0 \t 1 \t");
        for(int i=1;i<=n; i++){
            
            int next_term = num + nm1;
            System.out.print(next_term + "\t");
            
            nm1 = num;
            num = next_term;
            
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term:");
        int term = sc.nextInt();
        sc.close();

        fib(term);
    }
}
