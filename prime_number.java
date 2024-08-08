import java.util.Scanner;


public class Prime_number {

    static void isPrime(int n){

        boolean isprime = true;

        for (int i = 2; i <= Math.sqrt(n) ; i++) {

            if(n % i == 0){
                isprime = false;
                break;
            }
        }

        if(isprime == true){
            System.out.println("Number is Prime.");
        }else{
            System.out.println("Number is not Prime");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        

        isPrime(num);

    }
}
