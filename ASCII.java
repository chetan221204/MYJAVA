import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch= in.next().charAt(0);
        //char chr = 'a';
        System.out.println("ASCII VALUE OF CHAR IS :");
        System.out.println((int) ch);
    }
}