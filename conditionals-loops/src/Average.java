import java.util.Scanner;

public class Average
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        System.out.println("Enter the no. of numbers to find average:");
        double n = in.nextDouble();
        System.out.println("Enter the numbers: ");

        for(int i =0;i<n;i++)
        {
            num = in.nextInt();
            sum = sum + num;
            
        }
        double average = sum/n;
        System.out.println("Average: " + (sum/n));
    }
}