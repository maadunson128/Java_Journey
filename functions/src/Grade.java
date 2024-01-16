import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int mark = in.nextInt();

        System.out.println("Grade : " + grading(mark));

    }

    static String grading(int mark)
    {
        if(mark>=91 && mark<=100)
        {
            return "AA";
        }
        else if(mark>=81 && mark<=90)
        {
            return "AB";
            
        }
        else if(mark>=71 && mark<=80)
        {
            return "BB";
        }
        else if(mark>=61 && mark<=70)
        {
            return "BC";
        }
        else if(mark>=51 && mark<=60)
        {
            return "CC";
        }
        else if(mark>=41 && mark<=50)
        {
            return "DD";
        }
        else if(mark<40)
        {
            return "Fail";
        }
        else
        {
            System.out.println("Enter correct marks!!");
        }

        return "";
    }
}