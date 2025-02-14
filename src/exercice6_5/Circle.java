package exercice6_5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    

        public static void main(String[] args) {
            Circle c1 = new Circle(1.0);
            System.out.println("Circle: radius = " + c1.radius);
            System.out.println("Perimeter: " + c1.getPerimeter());
            System.out.println("Area: " + c1.getArea());
            System.out.println(c1);
        }
    

}

