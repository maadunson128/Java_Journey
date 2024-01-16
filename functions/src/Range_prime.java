import java.util.Scanner;

public class Range_prime
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the range for the Prime Numbers :");
        int from = in.nextInt();
        int to = in.nextInt();
        System.out.println("Prime Numbers : ");
        Prime(from,to);

    }

    static void Prime(int from,int to) 
    {
        int count = 0;
        for(int i=from;i<to;i++)
        {
            boolean status = true;
            if(i<=1)
            {
                status = false;
            }

            for(int j = 2; j*j<=i; j++)
            {
                if(i%j == 0)
                {
                    status = false;
                }
                
                
                
            }

            if(status)
            {
                System.out.println(i);
                count++;
                
            }

        }

        System.out.println("Count of Prime Numbers: " + count);


    }
}