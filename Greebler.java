import Java.util.Random;
public class Greebler extends Creature{
  private double dodgechance;
  public Greebler(int x, int y){
    super(100, 10, x, y, "Greebler", '\u20AA');
    dodgechance = 0.05;
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
