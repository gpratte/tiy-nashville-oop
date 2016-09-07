/**
 * Top level class. Is abstract so it cannot be instantiated (cannot be "new")
 */
public abstract class Animal {

    // Protected so it is accessible to sub classes
    protected String name;

    public String getName() {
        return name;
    }

    // Default implementation of this method. Will be overridden by sub classes
    public void makeSound() {
        System.out.println("Animal sound!");
    }
}
