public class Wall{
  private int x;
  private int y;
  private String barrier;
  public Wall(int xcor, int ycor, String direction){
    x = xcor;
    y = ycor;
    if(direction.equals("up")){
      barrier = "|";
    }
    else{
      barrier = "-";
    }
  }


}
