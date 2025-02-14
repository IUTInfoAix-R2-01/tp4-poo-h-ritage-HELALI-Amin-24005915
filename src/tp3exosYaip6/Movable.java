package tp3exosYaip6;

public interface Movable {
   public void moveUp();
   public abstract void moveDown();
   public abstract void moveLeft();
   public void moveRight();
   
   public static void main(String[] args) {
       MovablePoint point = new MovablePoint(0, 0, 1, 1);

       System.out.println("État initial : " + point);

       point.moveUp();
       System.out.println("Après déplacement vers le haut : " + point);

       point.moveDown();
       System.out.println("Après déplacement vers le bas : " + point);

       point.moveLeft();
       System.out.println("Après déplacement vers la gauche : " + point);

       point.moveRight();
       System.out.println("Après déplacement vers la droite : " + point);
   }
   
}
