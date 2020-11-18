package exercise8;
public class Demo{
  public static void main(String[] args){
    point p1 = new Point();
    p1.x = 5;
    p1.y = 6;
    point p2 = new Point(1, 2);
    point p3 = new Point(p2);

    p2.initialise(); 

    p2.translate(3, 4)

    p4 = p2.createNewTranslatedPoint(3, 4);

    boolean equal1 = p1.equals(p2);
    boolean equal2 = p2.equals(p1);

    String p1AsString = p2.toString();
    System.out.print("Point 1: " + p1);

  }
}