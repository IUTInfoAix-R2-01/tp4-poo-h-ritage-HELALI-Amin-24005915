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
//        GeometricObject circle = new Circle(5.0);
//        GeometricObject rectangle = new Rectangle(4.0, 6.0);
//
//        System.out.println(circle);
//        System.out.println("Area: " + circle.getArea());
//        System.out.println("Perimeter: " + circle.getPerimeter());
//
//        System.out.println(rectangle);
//        System.out.println("Area: " + rectangle.getArea());
//        System.out.println("Perimeter: " + rectangle.getPerimeter());
//    }

}
