public class Player extends Creature{
  private int babiesToCollect; //Will always satrt at 3 or more
  private int babiesCollected; //Will always staart at 0
  private int level;
  public Player(int h, int d, int x, int y, String n, char graph, int babiesToCollect){
    super(h, d, x, y, n, graph);//defines inherited variables
    this.babiesToCollect = babiesToCollect;
    babiesCollected = 0;
    level = 1;
  }
  //getMethod for babiesCollected and babiesToCollect
  public int getBabiesCollected(){
    return babiesCollected;
  }
  public int getBabiesToCollect(){
    return babiesToCollect;
  }
  public void resetBabiesToCollect(int n){
    babiesToCollect = n;
    babiesCollected = 0;
  }
  //Changes variables when baby is picked up
  public void pickUpBaby(){
    babiesToCollect--;
    babiesCollected++;
  }
  public int getLevel(){
    return level;
  }
  public void levelUp(){
    level++;
    this.addHealth(this.getLevel());
    this.setDamage(this.getDamage() + this.getLevel());
  }
}
