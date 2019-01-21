public class Creature{
  private int health; //health points of the creature
  private int damage; //damage ability of the creature
  private int xcor; //x-coordinate of the creature
  private int ycor; //y-coordinate of the creature
  private String name; //either "greebler" or "wallie" for greebler or player. Helps to identify each in attack method
  private char graphic; //Unicode character of the creature
  private String direction; //direction which the creature is looking in
  //Basic Creature constructor intakes health and damage and creates the creature on the terminal
  public Creature(int h, int d, int x, int y, String n, char graph){
    health = h;
    damage = d;
    this.xcor = x;
    this.ycor = y;
    name = n;
    graphic = graph;
    direction = "right";
  }

//Basic movement functions for all creatures
// change methods for private variables
  public void moveLeft(){
    xcor -= 1;
    direction = "left";
  }

  public void moveRight(){
    xcor += 1;
    direction = "right";
  }

  public void moveUp(){
    ycor -= 1;
    direction = "up";
  }

  public void moveDown(){
    ycor += 1;
    direction = "down";
  }

  //Get methods for variables
  public int getHealth(){
    return health;
  }

  public void subHealth(int newhel){
    health = health - newhel;
  }
  public void addHealth(int band){
    health = health + band;
  }
  public void setHealth(int ne){
    health = ne;
  }

  public int getDamage(){
    return damage;
  }

  public void setDamage(int newdam){
    this.damage = newdam;
  }

  public String getDirection(){
    return direction;
  }

  public void setDirection(String s){
    direction = s;
  }

  public int getX(){
    return xcor;
  }

  public int getY(){
    return ycor;
  }

  public void setX(int x){
    xcor = x;
  }

  public void setY(int y){
    ycor = y;
  }

  public String getName(){
    return name;
  }

  public char getGraphic(){
    return graphic;
  }

  public void changeGraphic(char n){
    graphic = n;
  }

}
