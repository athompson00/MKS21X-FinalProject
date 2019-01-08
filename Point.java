public class Point{
  private int x;
  private int y;
  public Point(xcor, ycor){
    x = xcor;
    y = ycor;
  }
  public String toString(){
    return "(" + x + "," + " " + y + ")";
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
}
