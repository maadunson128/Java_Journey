import java.util.Scanner;

public class Calc
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter operator: ");
            char ch = in.next().trim().charAt(0);
            int ans = 0;
            if(ch == '+' || ch =='-' || ch == '*' || ch == '/' || ch == '%')
            {
                System.out.print("Enter the numbers : ");
                int num1 = in.nextInt();
                int num2  = in.nextInt();

                if(ch == '+')
                {
                    ans = num1+num2;
                }

                else if(ch == '-')
                {
                    ans = num1-num2;
                }

                else if(ch == '*')
                {
                    ans = num1 * num2;
                }
                else if(ch == '/')
                {
                    if(num2!=0)
                    {
                        ans = num1/num2;
                    }
                    else
                    {
                        System.out.println(num1+" can't be divisible by 0");
                    }
                }
                else
                {
                    ans = num1 % num2;
                }

                System.out.println(ans);

            }
            else if(ch == 'x' || ch == 'X')
            {
                break;
            }

            else
            {
                System.out.println("Enter valid operator");
            }
        }
    }
}