import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        arms(num);

    }

    static void arms(int num)
    {
        double ans = 0;
        int num1 = num;
        int digit = 0; 
        while(num1>0)
        {

            int last = num1%10;
            num1 = num1/10;
            digit++;
        }

        int num2 = num;
        while(num2>0)
        {
            int last = num2%10;
            ans = ans + Math.pow(last, digit);
            num2 = num2/10;
        }

        if(ans == num)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("THe number is not Armstrong");
        }


    }
}