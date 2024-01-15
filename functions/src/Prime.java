import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();
        boolean ans = prime(num);
        if(ans)
        {
            System.out.println("Prime Number");
        }
        else
            System.out.println("Non-Prime Number");
    }

    static boolean prime(int num)
    {
        
        if(num<=1)
        {
            return false;
        }

        for(int i =2; i*i<=num;i++)
        {
            if(num%i == 0)
            {
                return false;
            }

        }

        return true;


    }
}