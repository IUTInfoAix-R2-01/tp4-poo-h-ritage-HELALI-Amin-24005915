package tp3exosYaip5;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red"; 
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    
//    public static void main(String[] args) {
//        Cylindre cylindre1 = new Cylindre(5.0, 10.0);
//
//        System.out.println("Rayon de la base du cylindre : " + cylindre1.base.getRadius());
//        System.out.println("Aire de la base du cylindre : " + cylindre1.getBaseArea());
//        System.out.println("Hauteur du cylindre : " + cylindre1.getHeight());
//        System.out.println("Volume du cylindre : " + cylindre1.getVolume());
//    }
}
