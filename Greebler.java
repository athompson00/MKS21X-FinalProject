import java.util.Random;
public class Greebler extends Creature{
  private Random randgen = new Random(); //used for dodging
  private double dodgeChance; //Chance that a greebler dodges an attack from the player

  public Greebler(int x, int y){
    super(200, 20, x, y, "Greebler", '\u0E08'); //inherited variables
    dodgeChance = 20; //the same for all greeblers
  }
  //used to modify damage variable
  public void changeDamage(int newDamage){
    this.setDamage(newDamage);
  }
  //returns true if dodge is successful and false if not
  public boolean Dodge(){
    int n = randgen.nextInt(100);
    if (dodgeChance > n){
      return true;
    } else {
      return false;
    }
  }
}
