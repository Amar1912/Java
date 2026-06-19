
public class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is eating FOOD...");
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat is eating FISH...");
    }
}

class Polymorphism {

    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat(); // Dog's eat method
        myCat.eat(); // Cat's eat method
    }
}
