
//public access modifier can be accessed from anywhere in the program
/*class Student {

    public String name = "Amar";
}

public class Access_Modifiers {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
    }
}*/
//Private access modifier can only be accessed within the class

/*class Student {

    private String name = "Amar";

    public String name() {
        return name;
    }
}

public class Access_Modifiers {

    public static void main(String[] args) {

        Student s1 = new Student();
        // System.out.println(s1.name); error: name has private access in Student
        System.out.println(s1.name());

    }
}*/
//Protected access modifier can be accessed within the package and by subclasses
class Student {

    protected String name = "Amar";
}

public class Access_Modifiers {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
    }
}
