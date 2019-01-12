public class Baby{
  private int x;
  private int y;
  private boolean isPickedUp;
  private char graphic;
  public Baby(int xcor, int ycor){
    x = xcor;
    y = ycor;
    isPickedUp = false;
    graphic = '\u03B2';
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
  public char getGraphic(){
    return graphic;
  }
}
