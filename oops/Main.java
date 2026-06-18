
class Student {

    String name;
    int age;
    int Roll_no;
    int marks = 14;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + Roll_no);
    }
}

public class Main {

    public static void main() {

        Student s1 = new Student();
        s1.name = "Amar";
        s1.age = 20;
        s1.Roll_no = 101;

        s1.display();

        Student s2 = new Student();
        s2.name = "Akbar";
        s2.age = 22;
        s2.Roll_no = 102;

        System.out.println(s2.marks);
        s2.marks = 15;
        System.out.println(s2.marks);

        s2.display();

    }
}

//The four main OOP concepts in Java are
/* 1. Encapsulation
   2. Inheritance
   3. Polymorphism
   4. Abstraction
 */
