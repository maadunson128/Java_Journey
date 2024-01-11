import java.util.Scanner;

public class Sum0
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the numbers: ");
        while (true) {
            int num = in.nextInt();

            if(num == 0)
            {
                break;
            }
            
            else
            {
                sum = sum + num;
            }
            
        }

        System.out.println("The sum is : " + sum);
    }
}