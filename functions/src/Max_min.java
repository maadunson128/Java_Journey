import java.util.Scanner;

public class Max_min
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("Maximum : " + Max(num1, num2, num3));
        System.out.println("Minimum : "  + Min(num1, num2, num3));

    }

    static int Max(int n1, int n2, int n3){
        int max = n1;
        if(n2>max)
        {
            max = n2;
        }
        if(n3>max)
        {
            max = n3;
        }

        return max;

    }

    static int Min(int n1, int n2, int n3){
        int min = n1;
        if(n2<min)
        {
            min = n2;
        }
        if(n3<min)
        {
            min = n3;
        }

        return min;

    }
}