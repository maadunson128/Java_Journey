import java.util.Scanner;

public class Rev
{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int num = in.nextInt();
        int rev_num = 0;
        while(num!=0)
        {
            int digit = num%10;
            num = num/10;
            rev_num = rev_num*10 + digit;

        }
        System.out.println(rev_num);
    }
}
