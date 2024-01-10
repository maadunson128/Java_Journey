import java.util.Scanner;

public class Arms
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int org_num = input.nextInt();

        int num1 = org_num;
        int n = 0;
        while(num1!=0)
        {
            num1 = num1/10;
            n++;
        }

        int num2 = org_num;
        int result = 0;

        while(num2!=0)
        {
            int digit = num2%10;
            int power =1;
            for(int i=0;i<n;i++)
            {
                power = power*digit;
            }

            result = result+power;
            num2 = num2/10;

        }

        if(result==org_num)
        {
            System.out.println("The number is Armstrong number");
        }
        else
            System.out.println("The number is not Armstrong number.");




    }
}