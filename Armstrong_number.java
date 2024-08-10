import java.util.Scanner;

public class Armstrong_number {

    static int digit(int n){
        int count = 0;

        while(n > 0){

            n = n / 10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int n) {
    
        double sum = 0;
        int power = digit(n);

        int temp = n;

        boolean result = false;

        while(temp > 0){
            int last_digit = temp % 10;
            sum += (Math.pow(last_digit, power));
            temp/=10;
        }

        if(sum == n){
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check:");
        int num = sc.nextInt();
        

        System.out.println("Number is armstrong: " + isArmstrong(num));
        sc.close();

    }
}
