package tp3exosYaip4;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog: Dog [" + super.toString() + "]";
    }
    
//    public static void main(String[] args) {
//        Animal animal = new Animal("Animal");
//        System.out.println(animal.toString());
//    }
    
}
