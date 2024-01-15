import java.util.Scanner;

public class Even_odd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = in.nextInt();

        System.out.println(Even_odd(num));
    }

    static String Even_odd(int num)
    {
        String str ;

        if(num%2 == 0)
        {
            str = "Even";
        }
        else
        {
            str = "Odd";
        }

        return str;
    }
}