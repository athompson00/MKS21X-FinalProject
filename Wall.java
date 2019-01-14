public class Wall{
  private int x;
  private int y;
  private char barrier;
  public Wall(int xcor, int ycor, String orientation){
    x = xcor;
    y = ycor;
    if(orientation.equals("\u2629")){
      barrier = '|';
    }
    else{
      barrier = '\u2629';
    }
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
