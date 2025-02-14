package tp3exosYaip6;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
    
//    public static void main(String[] args) {
//        MovablePoint point = new MovablePoint(0, 0, 1, 1);
//
//        System.out.println("État initial : " + point);
//
//        point.moveUp();
//        System.out.println("Après déplacement vers le haut : " + point);
//
//        point.moveDown();
//        System.out.println("Après déplacement vers le bas : " + point);
//
//        point.moveLeft();
//        System.out.println("Après déplacement vers la gauche : " + point);
//
//        point.moveRight();
//        System.out.println("Après déplacement vers la droite : " + point);
//    }
}

