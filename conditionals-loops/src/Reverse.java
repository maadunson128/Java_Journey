import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char ch ;
        String str1 = "";

        for(int i=0;i<str.length();i++)
        {
            ch = str.trim().charAt(i);
            str1 = ch + str1;

        }

        System.out.println(str1);
    }
    
}
