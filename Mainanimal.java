/* Create a superclass called Animal with a method makeSound() that prints
 the sound made by the animal. Implement subclasses Dog, Cat, and Cow that
  inherit from the Animal class. Implement the makeSound() method in each
   subclass to print the sound made by a dog, cat, and cow, respectively.*/

class Animal {
    public void makeSound() {
        System.out.println("I am an animal!");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

public class Mainanimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Cow cow = new Cow();
        cow.makeSound();
    }
}