import java.util.Scanner;

public class Factor
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        in.close();

        System.out.print("The factors are : ");
        for(int i=1;i<=num;i++)
        {
            if(num%i == 0)
            {
                System.out.print(i + " ");
            }
            
        }

        System.out.println();
    }
}