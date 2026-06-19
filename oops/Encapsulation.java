
public class Encapsulation {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Encapsulation student = new Encapsulation();

        student.setName("John");
        student.setAge(20);

        System.out.println("Age: " + student.getAge());
    }
}
