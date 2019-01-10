import Java.util.Random;
public class Greebler extends Creature{
  private int dodgeChance;
  //simple constructor
  public Greebler(int h, int d, int x, int y, String n, double c){
    super(int h, int d, int x, int y, String n);
    dodgeChance = c;
  }
  //used to modify damage variable
  public void changeDamage(newDamage){
    damage = newDamage;
  }
  //returns true if dodge is successful and false if not
  public boolean Dodge(){
    int n = java.util.Random.nextInt(100);
    if (dodgeChance > n){
      return true;
    } else {
      return false;
    }
  }
  //If greebler is attacked, this determines whether or not they take damage
  public void attacked(int d){
    if (!this.Dodge()){
      health = health - d;
    }
  }

  //attack player
  public void attack(){

  }

}
