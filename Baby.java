public class Baby{
  private int x;
  private int y;
  private boolean isPickedUp;
  public baby(int xcor, int ycor){
    x = xcor;
    y = ycor;
    isPickedUp = false;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public boolean isPickedUp(){
    return isPickedUp;
  }
}
