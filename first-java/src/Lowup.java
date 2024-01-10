import java.util.Scanner;



public class Lowup
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);

        if(ch>= 'a' && ch <='z')
        {
            System.out.println("Lower");
        }
        else if(ch>= 'A' && ch<= 'Z')
        {
            System.out.println("Uppercase");
        }

        else
        {
            System.out.println("Enter a letter character.");
        }


    }
}