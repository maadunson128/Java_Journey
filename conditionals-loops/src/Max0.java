import java.util.Scanner;

public class Max0
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true) {
            int num = in.nextInt();

            if(num == 0)
            {
                break;
            }
            else
            {
                if(num>max)
                {
                    max = num;
                }
            }
        }

        System.out.println("The maximum number is : "+ max);
    }
}