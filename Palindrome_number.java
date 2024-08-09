import java.util.Scanner;

public class Palindrome_number {

static void isPalindrome(int n){

    int reverse = 0;

    int copy =n;
        while (copy > 0) {
            int last_digit = copy % 10;
            reverse = (reverse * 10) + last_digit;
            copy /= 10;
        }

        // System.out.println(reverse);

        if(n == reverse){
            System.out.println("Number is Palindrome.");
        }else{
            System.out.println("Number is not Palindrome.");
        }    
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check for palindrome:");
        int num = sc.nextInt();
        sc.close();

        isPalindrome(num);

    }
}
