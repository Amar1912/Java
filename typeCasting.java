
public class typeCasting {

    public static void main(String[] args) {

        /* Type Casting 
        Type casting means converting one data type into another data type.

         For example:
            Convert int to double
            Convert double to int */
        int marks = 85;
        double doubleMarks = marks;

        System.out.println("Integer marks: " + marks);
        System.out.println("Double marks: " + doubleMarks);

        //Narrowing Casting (Explicit)
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("Double pi: " + pi);
        System.out.println("Integer pi: " + intPi);

        char Letter = 'A';
        int value = Letter;
        System.out.println("Character: " + Letter);
        System.out.println("ASCII value: " + value);

    }
}
