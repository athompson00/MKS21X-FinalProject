
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
import java.util.ArrayList;

public class Demo{
  static ArrayList<Wall> grid = new ArrayList<Wall>();
  static ArrayList<Greebler> greeblers = new ArrayList<Greebler>();
  static ArrayList<Integer> killed = new ArrayList<Integer>();
  static ArrayList<Baby> babies = new ArrayList<Baby>();
  static Player one = new Player(1000, 100, 10, 10, "wallie", '\u00a6', 4);


  //perimeter
  static Wall side0 = new Wall(1,7, "");
  static Wall side1 = new Wall(2,7, "");
  static Wall side2 = new Wall(3,7, "");
  static Wall side3 = new Wall(4,7, "");
  static Wall side4 = new Wall(5,7, "");
  static Wall side5 = new Wall(6,7, "");
  static Wall side6 = new Wall(7,7, "");
  static Wall side7 = new Wall(8,7, "");
  static Wall side8 = new Wall(9,7, "");
  static Wall side9 = new Wall(10,7, "");
  static Wall side10 = new Wall(11,7, "");
  static Wall side11 = new Wall(12,7, "");
  static Wall side12 = new Wall(13,7, "");
  static Wall side13 = new Wall(14,7, "");
  static Wall side14 = new Wall(15,7, "");
  static Wall side15 = new Wall(16,7, "");
  static Wall side16 = new Wall(17,7, "");
  static Wall side17 = new Wall(18,7, "");
  static Wall side18 = new Wall(19,7, "");
  static Wall side19 = new Wall(20,7, "");
  static Wall side20 = new Wall(21,7, "");
  static Wall side21 = new Wall(22,7, "");
  static Wall side22 = new Wall(23,7, "");
  static Wall side23 = new Wall(24,7, "");
  static Wall side24 = new Wall(25,7, "");
  static Wall side25 = new Wall(26,7, "");
  static Wall side26 = new Wall(27,7, "");
  static Wall side27 = new Wall(28,7, "");
  static Wall side28 = new Wall(29,7, "");
  static Wall side29 = new Wall(30,7, "");
  static Wall side30 = new Wall(31,7, "");
  static Wall side31 = new Wall(32,7, "");
  static Wall side32 = new Wall(33,7, "");
  static Wall side33 = new Wall(34,7, "");
  static Wall side34 = new Wall(35,7, "");
  static Wall side35 = new Wall(36,7, "");
  static Wall side36 = new Wall(37,7, "");
  static Wall side37 = new Wall(38,7, "");
  static Wall side38 = new Wall(39,7, "");
  static Wall side39 = new Wall(40,7, "");
  static Wall side40 = new Wall(41,7, "");
  static Wall side41 = new Wall(42,7, "");
  static Wall side42 = new Wall(43,7, "");
  static Wall side43 = new Wall(44,7, "");
  static Wall side44 = new Wall(45,7, "");
  static Wall side45 = new Wall(46,7, "");
  static Wall side46 = new Wall(47,7, "");
  static Wall side47 = new Wall(48,7, "");
  static Wall side48 = new Wall(49,7, "");
  static Wall side49 = new Wall(50,7, "");
  static Greebler greeb1 = new Greebler(20, 15);
  static Greebler greeb2 = new Greebler(30,20);
  static Baby baby1 = new Baby(40, 10);

  public static void fillScreen(Terminal t){
    grid.add(side0);
    grid.add(side1);
    grid.add(side2);
    grid.add(side3);
    grid.add(side4);
    grid.add(side5);
    grid.add(side6);
    grid.add(side7);
    grid.add(side8);
    grid.add(side9);
    grid.add(side10);
    grid.add(side11);
    grid.add(side12);
    grid.add(side13);
    grid.add(side14);
    grid.add(side15);
    grid.add(side16);
    grid.add(side17);
    grid.add(side18);
    grid.add(side19);
    grid.add(side20);
    grid.add(side21);
    grid.add(side22);
    grid.add(side23);
    grid.add(side24);
    grid.add(side25);
    grid.add(side26);
    grid.add(side27);
    grid.add(side28);
    grid.add(side29);
    grid.add(side30);
    grid.add(side31);
    grid.add(side32);
    grid.add(side33);
    grid.add(side34);
    grid.add(side35);
    grid.add(side36);
    grid.add(side37);
    grid.add(side38);
    grid.add(side39);
    grid.add(side40);
    grid.add(side41);
    grid.add(side42);
    grid.add(side43);
    grid.add(side44);
    grid.add(side45);
    grid.add(side46);
    grid.add(side47);
    grid.add(side48);
    grid.add(side49);

    greeblers.add(greeb1);
    greeblers.add(greeb2);
    for(int l = 0; l < killed.size(); l++){
      if(greeblers.get(l).getHealth() <= 0){
        greeblers.remove(l);
      }
    }
    babies.add(baby1);
    for(int i = 0; i < grid.size(); i++){
      t.moveCursor(grid.get(i).getwallX(), grid.get(i).getwallY());
      t.putCharacter(grid.get(i).getBarrier());
    }
    for(int j = 0; j < greeblers.size(); j++){
      t.moveCursor(greeblers.get(j).getX(), greeblers.get(j).getY());
      t.putCharacter(greeblers.get(j).getGraphic());
    }
    for(int k = 0; k < babies.size(); k++){
      t.moveCursor(babies.get(k).getX(), babies.get(k).getY());
      t.putCharacter(babies.get(k).getGraphic());
    }
  }

  public static void putString(int r, int c,Terminal t, String s){
		t.moveCursor(r,c);
		for(int i = 0; i < s.length();i++){
			t.putCharacter(s.charAt(i));
		}
	}

  public static void attack(Creature c){
    //saves index of greebler that is getting attacked
    int d =0;
    //checks from perspective of player for greeblers surrounding it and attacks
    //any that are in his/her proximity
    c.setDirection("right");
    if(checkInFront(c).equals("greebler")){
      for(int i = 0; i < greeblers.size(); i++){
        if(greeblers.get(i).getX() + 1 == c.getX() && c.getY() == greeblers.get(i).getY()){
          d = i;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() <= 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkInFront(c).equals("player")){
      one.subHealth(c.getDamage());
    }


    c.setDirection("left");
    if(checkInFront(c).equals("greebler")){
      for(int j = 0; j < greeblers.size(); j++){
        if(greeblers.get(j).getX() - 1 == c.getX() && c.getY() == greeblers.get(j).getY()){
          d = j;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkInFront(c).equals("player")){
      one.subHealth(c.getDamage());
    }



    c.setDirection("down");
    if(checkInFront(c).equals("greebler")){
      for(int k = 0; k < greeblers.size(); k++){
        if(greeblers.get(k).getX() == c.getX() && c.getY() == greeblers.get(k).getY() + 1){
          d = k;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkInFront(c).equals("player")){
      one.subHealth(c.getDamage());
    }


    c.setDirection("up");
    if(checkInFront(c).equals("greebler")){
      for(int l = 0; l < greeblers.size(); l++){
        if(greeblers.get(l).getX() == c.getX() && c.getY() == greeblers.get(l).getY() - 1){
          d = l;
        }
      }
      greeblers.get(d).subHealth(c.getDamage());
      if(greeblers.get(d).getHealth() == 0){
        killed.add(d);
        greeblers.get(d).changeGraphic('\u0000');
        greeblers.get(d).setX(99);
        greeblers.get(d).setY(99);
      }
    }
    if(checkInFront(c).equals("player")){
      one.subHealth(c.getDamage());
    }


    //exits system if player is dead
    if(one.getHealth() <= 0){
      System.exit(1);
    }
  }










  //checks position in front of creature for a
  //creature, wall, or baby and returns a String with the
  //type of thing in front of it
  //commented out and moved to creature class
  public static String[] checkAround(Creature n){
    String[] surroundings = new String[4];
    //checks for walls in the immediate surroundings of the player
    for (int i = 0; i < grid.size(); i++){
      if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() + 1){
        surroundings[0] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() - 1){
        surroundings[2] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() + 1 && grid.get(i).getwallY() == n.getY()){
        surroundings[1] = "wall";
      }
      if (grid.get(i).getwallX() == n.getX() - 1 && grid.get(i).getwallY() == n.getY()){
        surroundings[3] = "wall";
      }
    }

    // checks for greeblers in the immediate surroundings of the player
    for (int i = 0; i < greeblers.size(); i++){
      if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() == n.getY() + 1){
        surroundings[0] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() == n.getY() - 1){
        surroundings[2] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() + 1 && greeblers.get(i).getY() == n.getY()){
        surroundings[1] = "greebler";
      }
      if (greeblers.get(i).getX() == n.getX() - 1 && greeblers.get(i).getY() == n.getY()){
        surroundings[3] = "greebler";
      }
    }

    //checks if there is a baby in front of anything
    for (int i = 0; i < babies.size(); i++){
      if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() + 1){
        surroundings[0] = "baby";
      }
      if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() - 1){
        surroundings[2] = "baby";
      }
      if (babies.get(i).getX() == n.getX() + 1 && babies.get(i).getY() == n.getY()){
        surroundings[1] = "baby";
      }
      if (babies.get(i).getX() == n.getX() - 1 && babies.get(i).getY() == n.getY()){
        surroundings[3] = "baby";
      }
    }
    return surroundings;

  }









//PickUpBaby(player n, baby1) Allows player to pickup the babies
public static void pickUpBaby(Player n, Terminal t){
  int a = - 1;
  for (int i = 0; i < babies.size(); i++){
    if (babies.get(i).getX() == n.getX() && babies.get(i).getY() + 1 == n.getY()){
      a = i;
    }
  }
  if (a != -1){
    babies.get(a).pickUp();
    n.pickUpBaby();
    babies.get(a).changeGraphic('\u0000');
    t.moveCursor(babies.get(a).getX(), babies.get(a).getY());
    t.putCharacter(babies.get(a).getGraphic());
    babies.get(a).setX(50);
    babies.get(a).setY(50);
  }
}

  public static void main(String[] args){
    Terminal terminal = TerminalFacade.createTextTerminal();
    terminal.enterPrivateMode();
    TerminalSize size = terminal.getTerminalSize();
    size.setRows(50);
    size.setColumns(50);
    terminal.setCursorVisible(false);
    boolean running = true;


    int x = 10;
    int y = 10;

    while(running){

			terminal.moveCursor(one.getX(),one.getY());
			terminal.applyBackgroundColor(Terminal.Color.WHITE);
			terminal.applyForegroundColor(Terminal.Color.BLACK);
			//applySGR(a,b) for multiple modifiers (bold,blink) etc.
			terminal.applySGR(Terminal.SGR.ENTER_UNDERLINE);
			terminal.putCharacter('\u00a4');
			//terminal.putCharacter(' ');
			terminal.applyBackgroundColor(Terminal.Color.DEFAULT);
			terminal.applyForegroundColor(Terminal.Color.DEFAULT);
			terminal.applySGR(Terminal.SGR.RESET_ALL);


			terminal.moveCursor(size.getColumns()-5,5);
			terminal.applyBackgroundColor(Terminal.Color.RED);
			terminal.applyForegroundColor(Terminal.Color.YELLOW);
			terminal.applySGR(Terminal.SGR.ENTER_BOLD);
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter('\u262d');
			terminal.putCharacter(' ');
			terminal.moveCursor(size.getColumns()-5,6);
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.putCharacter(' ');
			terminal.applyForegroundColor(Terminal.Color.DEFAULT);

      fillScreen(terminal);
      putString(1, 2, terminal, "Player health: " + one.getHealth());
      putString(1, 3, terminal, "greebler 1 health: " + greeb1.getHealth());
      putString(1, 4, terminal, "greebler 2 health: " + greeb2.getHealth());
      putString(1, 5, terminal, "Babies To Pick Up: " + one.getBabiesToCollect());
      putString(1, 6, terminal, "Babies Picked Up: " + one.getBabiesCollected());

			Key key = terminal.readInput();

			if (key != null)
			{

				if (key.getKind() == Key.Kind.Escape) {

					terminal.exitPrivateMode();
					running = false;
					System.out.println(one.getX());
					System.out.println(one.getY());
				}

				if (key.getKind() == Key.Kind.ArrowLeft) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("left");
          if (checkInFront(one).equals("")){
				        one.moveLeft();
                x--;
            }
				}

				if (key.getKind() == Key.Kind.ArrowRight) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("right");
          if (checkInFront(one).equals("")){
					   one.moveRight();
             x++;
          }
				}

				if (key.getKind() == Key.Kind.ArrowUp) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("up");
          if (checkInFront(one).equals("")){
					   one.moveUp();
             y++;
          }
				}

				if (key.getKind() == Key.Kind.ArrowDown) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("down");
					if (checkInFront(one).equals("")){
					  one.moveDown();
            y--;
          }
          if (checkInFront(one).equals("baby")){
            one.moveDown();
            pickUpBaby(one, terminal);
          }
				}
				//attacking
				if (key.getCharacter() == ' ') {
					attack(one);
				}
      }
      attack(greeb1);
      attack(greeb2);
    }
  }
}
