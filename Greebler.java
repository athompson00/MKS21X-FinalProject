public class Greebler extends Creature{
  private double dodgechance;
  public Greebler(int x, int y){
    super(100, 10, x, y, "Greebler", '\u20AA');
    dodgechance = 0.05;
  }
  public void attack(){
  }

}
