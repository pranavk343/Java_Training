import java.util.Locale;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String f = sc.next();
        System.out.println("Enter Middle Name : ");
        String m = sc.next();
        System.out.println("Enter Last name : ");
        String l = sc.next();
        System.out.println(f.toUpperCase()+" "+m.toUpperCase()+" "+l.toUpperCase());
    }
}
