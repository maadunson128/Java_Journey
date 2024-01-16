import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = in.nextInt();
        System.out.println("Factorial : " + Fact(num));

    }

    static int Fact(int num)
    {
        int fact = 1;
        for(int i =1;i<=num;i++)
        {
            fact = fact*i;
        }

        return fact;

    }

    
}