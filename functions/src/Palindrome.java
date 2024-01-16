import java.util.Scanner;

public class  Palindrome
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Palindrome Number : " + palind(num));

    }

    static String palind(int num)
    {
        int num1 = num;
        int rev = 0;
        int digit = 0;
        while(num1>0)
        {
            digit = num1%10;
            rev = rev*10 + digit;
            num1 = num1/10;
        }

        if(rev == num)
        {
            return "True";
        }
        return "False";
    }
}