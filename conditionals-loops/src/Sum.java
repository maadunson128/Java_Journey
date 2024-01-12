import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("The sum is : "+ (num1+num2));
    }
}