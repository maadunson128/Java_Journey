import java.util.Scanner;

public class Sum_neo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        int sum_neg = 0;
        int sum_even = 0;
        int sum_odd = 0;
        while (true) {
            int num = in.nextInt();
            if(num == 0)
            {
                break;
            }

            if(num>0)
            {
                
                if(num%2 == 0)
                {
                    sum_even = sum_even + num;
                }
                else
                {
                    sum_odd = sum_odd + num;
                }

            }

            else{
                sum_neg = sum_neg + num;
            }


        }

        System.out.println("Sum of negative numbers :" + sum_neg);
        System.out.println("Sum of Positive Even :" + sum_even);
        System.out.println("Sum of Positive odd numbers :" + sum_odd);
    }
}