import java.util.Scanner;

public class Fibonacii_sum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fir = 0;
        int sec = 1;
        int result = 0;
        int sum = 1;
        int num = in.nextInt();
        
        for(int i =1;i<num;i++)
        {
            result = fir + sec;
            sum  = sum + result;
            fir = sec;
            sec = result;
    
        }

        System.out.println("The fibonacii series sum upto "+result+ " : " + sum);
    }
}