//API : http://mabe02.github.io/lanterna/apidocs/2.1/
import com.googlecode.lanterna.terminal.Terminal.SGR;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.LanternaException;
import com.googlecode.lanterna.input.CharacterPattern;
import com.googlecode.lanterna.input.InputDecoder;
import com.googlecode.lanterna.input.InputProvider;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.KeyMappingProfile;

public class Creature{
  private int health;
  private int damage;
  private int xcor;
  private int ycor;
  private String name;
  private String graphic;
  //Basic Creature constructor intakes health and damage and creates the creature on the terminal
  public Creature(int h, int d, int x, int y, String n){
    health = h;
    damage = d;
    xcor = x;
    ycor = y;
    name = n;
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
  public void changeDamage(d){
    damage = d;
  }

  public void changeHealth(h){
    health = h;
  }

}
