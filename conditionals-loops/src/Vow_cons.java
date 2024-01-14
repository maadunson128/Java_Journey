import java.util.Scanner;

public class Vow_cons {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if((ch>= 'A' || ch>= 'a')&& (ch<='Z' || ch <='z'))
        {
            switch (ch) {
                case 'A' ,'E','I','O','U','a','e','i','o','u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Enter a letter !!");
        }
    }
}