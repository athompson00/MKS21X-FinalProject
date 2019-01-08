public class Creature{
  private int health;
  private int damage;
  private int xcor;
  private int ycor;
  private String name;
  private char graphic;
  //Basic Creature constructor intakes health and damage and creates the creature on the terminal
  public Creature(int h, int d, int x, int y, String n, char graph){
    health = h;
    damage = d;
    xcor = x;
    ycor = y;
    name = n;
    graphic = graph;
  }

//Basic movement functions for all creatures
  public void moveLeft(){
    xcor -= 1;
  }

  public void moveRight(){
    xcor += 1;
  }

  public void moveUp(){
    ycor += 1;
  }

  public void moveDown(){
    ycor -= 1;
  }

  //Get methods for variables
  public int getHealth(){
    return health;
  }
  public int getDamage(){
    return damage;
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
