import java.io.Serializable;

/**
 * Created by gilpratte on 9/7/16.
 */
public class AnimalTest {

    public static void main(String args[]) {
        // Create a concrete dog
        Dog dog = new Dog();

        // dog is-a Dog
        System.out.println("Is a dog a dog? " +
                (dog instanceof Dog));

        // dog is-a Mammal
        System.out.println("Is a dog a mammal? " +
                (dog instanceof Mammal));

        // dog is-a Serializable since it implements the interface
        System.out.println("Is a dog serializable? " +
                (dog instanceof Serializable));

        // Pass the Dog
        speak(dog);

        // Pass the dog
        isFurry(dog);

    }

    // This method takes an Animal type but the call
    // to makeSound runs the overridden methos in Dog
    private static void speak(Animal thing) {
        thing.makeSound();
    }


    // This method takes an Mammal type but the call
    // to makeSound runs the overridden methos in Dog
    private static void isFurry(Mammal mam) {
        System.out.println("Is " + mam.getName() + " furry? " + mam.hasFur());
    }
}
