package Tugas;

public class TugasC {}

class Animal {
    
    public void makeNoise() {
        System.out.println("Talk");
    }   
}

class Dog extends Animal { 
    
    public void makeNoise() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animalDog = new Dog();
        animalDog.makeNoise();

        if (animal instanceof Animal) {
            System.out.println("animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }

        if (animalDog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }

        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
}
