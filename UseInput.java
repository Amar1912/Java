
import java.util.Scanner;

public class UseInput {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("your age is: " + age + "\n");

        System.err.println("Enter your name: ");
        String name = sc.next();
        System.out.print("your name is: " + name + "\n");

        sc.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("your full name is: " + fullName);

        sc.close();
    }
}
