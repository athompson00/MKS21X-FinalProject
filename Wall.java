public class Wall{
  private int x; //x-coordinate of the wall
  private int y; //y-coordinate of the wall
  private char barrier; //graphic of the wall

  public Wall(int xcor, int ycor, String orientation){
    x = xcor;
    y = ycor;
    barrier = '\u2629';
  }
  public int getwallX(){
    return x;
  }
  public int getwallY(){
    return y;
  }
  public char getBarrier(){
    return barrier;
  }
  public String toString(){
    return "(" + this.getwallX() +","+ this.getwallY() + ")";
  }

}
