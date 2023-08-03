abstract class Animal {
    public abstract void eat();
    public void sleep() {
        System.out.println("All animals with a decent-sized brain engage in sleep");
    }

    public abstract void print();
}

// Horse class define
class Horse extends Animal {
    public void eat() {
        System.out.println("Horse eats grass and plants");
    }

    public void print() {
        System.out.println("Horse is a herbivorous animal");
    }
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats other animals");
    }

    public void print() {
        System.out.println("Lion is a carnivorous animal");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.sleep();
        horse.print();

        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.print();
    }
}

