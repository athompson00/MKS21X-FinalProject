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
  public void setX(int xcor){
    x = xcor;
  }
  public void setY(int ycor){
    y = ycor;
  }
  public boolean isPickedUp(){
    return isPickedUp;
  }

  public char getGraphic(){
    return graphic;
  }

  public void changeGraphic(char n){
    graphic = n;
  }
  //Pickup method enables baby to be picked up
  public void pickUp(){
    isPickedUp = true;
  }
}
