import java.util.Scanner;

public class Per_com
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.print("Enter the Total number of items(Objects) : ");
        int n = in.nextInt();
        System.out.print("Enter the number of selected items : ");
        int r = in.nextInt();

        System.out.println("Permutation : " + factor(n)/factor(n-r));
        System.out.println("Combination : " + factor(n)/(factor(n-r)*factor(r)));

    }

    static int factor(int n)
    {
        int fact = 1;

        for(int i =1;i<=n;i++)
        {
            fact = fact*i;
        }

        return fact;


    }
}