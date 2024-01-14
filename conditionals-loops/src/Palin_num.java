import java.util.Scanner;

public class Palin_num {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int num = in.nextInt();

        int rev = 0;
        int digit = 0;
        int num1 = num;
        while (num1>0) {
            digit = num1 %10;
            num1 = num1/10;
            rev = rev *10 + digit;
            
        }

        if(num == rev)
        {
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palidrome number");
        }
    }
    
}
