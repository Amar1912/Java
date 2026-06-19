
class Animal {

    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking...");
    }
}

class Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();    // inherited
        dog.sleep();  // inherited
        dog.bark();   // Dog's own method
    }
}
