//import Java.util.Random;
public class Greebler extends Creature{
  private double dodgeChance;
  public Greebler(int x, int y){
    super(200, 10, x, y, "Greebler", '\u0E08');
    dodgeChance = 0.15;
  }
  //used to modify damage variable
  public void changeDamage(int newDamage){
    this.setDamage(newDamage);
  }
  //returns true if dodge is successful and false if not
  public boolean Dodge(){
    int n = 0;// = java.util.Random.nextInt(100);
    if (dodgeChance > n){
      return true;
    } else {
      return false;
    }
  }
}
