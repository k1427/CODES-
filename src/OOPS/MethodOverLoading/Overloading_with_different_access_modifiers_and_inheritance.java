/*
In this example, the makeSound() method is overloaded in the Animal class and overridden in the Dog class.
The public version of the makeSound() method is accessible from anywhere,
while the protected version is accessible within the same class and subclasses.
The Dog class overrides the makeSound() method and provides its own implementation.
 */

package OOPS.MethodOverLoading;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    protected void makeSound(String sound) {
        System.out.println("Animal makes sound: " + sound);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overloading_with_different_access_modifiers_and_inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();                     // Calls the public makeSound() method of Animal

        Dog dog = new Dog();
        dog.makeSound();                        // Calls the overridden makeSound() method in Dog
        dog.makeSound("Woof!");                 // Calls the protected makeSound() method in Animal
    }
}


/*
OUTPUT:
    Animal makes sound
    Dog barks
    Animal makes sound: Woof!
 */