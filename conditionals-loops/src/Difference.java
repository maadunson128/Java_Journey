import java.util.Scanner;

public class Difference
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num1 = 0;
        int sum = 0;
        int product = 1;
        while(num>0)
        {
            num1 = num%10;
            sum = sum + num1;
            product = product * num1;
            num = num/10;


        }

        System.out.println("The difference between sum and product : "+ (product-sum));
    }
}