package tp3exosYaip6;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "circle[radius=" + radius + "]";
    }
    
//    public static void main(String[] args) {
//        Animal myCat = new Cat("skibidi");
//        Dog myDog = new Dog("marge");
//        BigDog myBigDog = new BigDog("marcus");
//
//        myCat.greets(); 
//        myDog.greets(); 
//
//        myBigDog.greets(); 
//        Dog anotherDog = new Dog("speed");
//        myDog.greets(anotherDog);
//        BigDog anotherBigDog = new BigDog("beast");
//        myBigDog.greets(anotherDog); 
//        myBigDog.greets(anotherBigDog); 
//    }
}
