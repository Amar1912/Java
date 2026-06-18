
class Student {

    String name;

    void study(String name) {
        System.out.println(name + " is studying");
    }
}

public class methods {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.study("Amar");
        s2.study("Shubham");

    }
}
