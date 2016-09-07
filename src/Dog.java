import java.io.Serializable;

/**
 * Concrete class (not an abstract class)
 */
public class Dog extends Mammal implements Serializable{

    /**
     * Sets the name to Dog
     */
    public Dog() {
        this.name = "Dog";
    }

    /**
     * Implementation of the abstract method hasFur
     */
    @Override
    public boolean hasFur() {
        return true;
    }

    /**
     * Overrides the makeSound method in Animal
     */
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
