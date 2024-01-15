import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();

        System.out.println("Elgibility for voting : " + Eligibility(age));
    }

    static String Eligibility(int age)
    {
        String str;
        if(age>=18)
        {
            str = "Yes";
        }
        else
        {
            str = "No";
        }

        return str;
    }
}