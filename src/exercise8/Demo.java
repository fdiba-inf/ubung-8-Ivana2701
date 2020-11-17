package exercise8;
public class Demo{
  public static void main(String[] args){
    point p1 = new Point();
    p1.x = 5;
    p1.y = 6;
    point p2 = new Point(x: 1, y: 2);
    point p3 = new Point(p2);

    p2.initialise(); 

    p2.translate(xDelta: 3, yDelta: 4)

    p4 = p2.createNewTranslatedPoint(xDelta: 3, yDelta: 4);
    
  }
}