/**
 * This is a mammal abstract class so it cannot be instantiated. Is a sub class of Animal
 */
public abstract class Mammal extends Animal {

    /**
     * Constructor sets the name to "Mammal"
     */
    public Mammal() {
        name = "Mammal";
    }

    /**
     * Abstract methods have to be implemented by at least one of
     * the children, in this case by Dog
     */
    public abstract boolean hasFur();

}
