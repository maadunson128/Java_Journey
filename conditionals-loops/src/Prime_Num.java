import java.util.Scanner;

public class Prime_Num
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = true;

        if(num<=1)
        {
            ans = false;
        }
        for(int i = 2; i*i <= num;i++)
        {
            if (num%i == 0) {
                ans = false;
            }
        }

        System.out.println("Prime Number : " + ans);
    }
}