public class Projectile extends Creature{
  private String team = "";
  public Projectile(int x, int y, String Direction, String team){
    super(1, 200, x, y, Direction, '\u0F13');
    if (this.team.equals("Player")){
      changeGraphic('\u0F1A');
    }
  }
}
