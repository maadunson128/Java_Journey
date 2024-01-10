import java.util.Scanner;

public class Palind
{
    public static void main(String[] args)
    {
        String str = "";
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String etr_String = input.nextLine();

        for(int i =0;i<etr_String.length();i++)
        {
            char chr = etr_String.charAt(i);
            str = chr+str;
        }
        

        if(etr_String.equals(str))
        {
            System.out.println("The entered number is Palindrome.");
        }
        else
            System.out.println("The entered number is not Palindrome.");

    }
}