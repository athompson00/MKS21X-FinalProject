public class Creature{
  private int health;
  private int damage;
  private Point location;
  private String name;
  private char graphic;
  private String direction;
  //Basic Creature constructor intakes health and damage and creates the creature on the terminal
  public Creature(int h, int d, int x, int y, String n, char graph){
    health = h;
    damage = d;
    location = new Point(x, y);
    name = n;
    graphic = graph;
    direction = "right";
  }

//Basic movement functions for all creatures
  public void moveLeft(){
    xcor -= 1;
    direction = "left";
  }

  public void moveRight(){
    xcor += 1;
    direction = "right";
  }

  public void moveUp(){
    ycor += 1;
    direction = "up";
  }

  public void moveDown(){
    ycor -= 1;
    direction = "down";
  }

  //Get methods for variables
  public int getHealth(){
    return health;
  }
  public int getDamage(){
    return damage;
  }
  public String getDirection(){
    return direction;
  }
  public void setDamage(int newdam){
    this.damage = newdam;
  }
  public void setHealth(int newhel){
    this.health = newhel;
  }
  public int getX(){
    return xcor;
  }
  public int getY(){
    return ycor;
  }
  public String getName(){
    return name;
  }
// change methods for private variables
  public void changeDamage(int d){
    damage = d;
  }

  public void changeHealth(int h){
    health = h;
  }
  public char getGraphic(){
    return graphic;
  }


}
