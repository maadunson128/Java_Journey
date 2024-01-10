import java.util.Scanner;

public class Last
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int count = 0;
        while(num!=0)
        {
            int n = num%10;
            if(n==3)
            {
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
        
    }
}