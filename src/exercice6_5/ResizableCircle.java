package exercice6_5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius = this.radius * (1 + percent / 100.0);
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }
    

        public static void main(String[] args) {
            ResizableCircle rc1 = new ResizableCircle(1.0);
            System.out.println("ResizableCircle: radius = " + rc1.radius);
            System.out.println("Perimeter: " + rc1.getPerimeter());
            System.out.println("Area: " + rc1.getArea());
            System.out.println(rc1);

            rc1.resize(10);
            System.out.println("After resizing by 10%:");
            System.out.println("ResizableCircle: radius = " + rc1.radius);
            System.out.println("Perimeter: " + rc1.getPerimeter());
            System.out.println("Area: " + rc1.getArea());
            System.out.println(rc1);
        }
}



