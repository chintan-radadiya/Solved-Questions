import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();
        
        sc.close();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("Leap year");
            }
            
        }else{
            System.out.println("Not Leap year");
        }
    }
}
