import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int sum = 0;
        
        for(int i = 1;i<num;i++)
        {
            int num1 = num%i;
            if(num1==0)
            {
                sum = sum+i;
            }
        }

        if(sum == num)
        {
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not perfect Number");
        }
    }
}