package tp3exosYaip4;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat: Cat [" + super.toString() + "]";
    }
    
//    public static void main(String[] args) {
//        Animal animal = new Animal("Animal");
//        System.out.println(animal.toString());
//    }
    
}
