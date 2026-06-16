
public class Operators {

    public static void main() {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Assignment Operators
        int c = a; // c is now 10
        c += b; // c is now 15
        System.out.println("c after +=: " + c); // 15

        c -= b; // c is now 10
        System.out.println("c after -=: " + c); // 10

        c *= b; // c is now 50
        System.out.println("c after *=: " + c); // 50

        c /= b; // c is now 10
        System.out.println("c after /=: " + c); // 10

        c %= b; // c is now 0
        System.out.println("c after %=: " + c); // 0

        // Comparison Operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false
        System.out.println("!y: " + (!y)); // true

        // Increment and Decrement Operators
        int d = 5;
        System.out.println("d: " + d); // 5
        System.out.println("d++: " + (d++)); // 5 (post
        System.out.println("d: " + d); // 6
        System.out.println("++d: " + (++d)); // 7 (pre) 

        // Ternary Operator
        /*condition ? valueIfTrue : valueIfFalse; */
        int age = 20;

        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);

    }
}
