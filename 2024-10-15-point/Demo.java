public class Demo{

    /*
    Write this method third. Test it then move on
    to the others.
    */
    public static double distance(Point a, Point b){
      return Math.pow((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)), 0.5);
    }
  
    public static void main(String[]args){
      //Point constructor
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      Point p4 = new Point(p3);
      Point origin = new Point(0, 0);
      //toString
      System.out.println( p3);
      System.out.println(p4.toString());
      //distance method in Demo
      System.out.println( distance(p1,p2));
      System.out.println(distance(p3, origin));
      //distance method in Point
      System.out.println( Point.distance(p1,p2));
      //distanceTo non-static method
      System.out.println(p3.distanceTo(origin));
      System.out.println( p1.distanceTo(p2));
  
  
    }
  }