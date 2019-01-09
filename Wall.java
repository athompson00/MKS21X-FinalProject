public class Wall{
  private int x;
  private int y;
  private char barrier;
  public Wall(int xcor, int ycor, String orientation){
    x = xcor;
    y = ycor;
    if(orientation.equals("up")){
      barrier = '|';
    }
    else{
      barrier = '-';
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


}
