// Animal abstract class
abstract class Animal {
    // eat abstract function
    public abstract void eat();
    public void sleep() {
        System.out.println("All animals with a decent-sized brain engage in sleep");
    }

    // print abstract
    public abstract void print();
}

// Horse class define
class Horse extends Animal {
    // eat function
    public void eat() {
        System.out.println("Horse eats grass and plants");
    }

    // print function
    public void print() {
        System.out.println("Horse is a herbivorous animal");
    }
}

// Lion class define
class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats other animals");
    }

    public void print() {
        System.out.println("Lion is a carnivorous animal");
    }
}

// Main Class Define
public class Main {
    public static void main(String[] args) {
        // Create horse object
        Horse horse = new Horse();
        horse.eat();
        horse.sleep();
        horse.print();
        // Create lion class object
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.print();
    }
}

