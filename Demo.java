
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
  static Wall side0 = new Wall(0,0, "");
  static Wall side1 = new Wall(1,0, "");
  static Wall side2 = new Wall(2,0, "");
  static Wall side3 = new Wall(3,0, "");
  static Wall side4 = new Wall(4,0, "");
  static Wall side5 = new Wall(5,0, "");
  static Wall side6 = new Wall(6,0, "");
  static Wall side7 = new Wall(7,0, "");
  static Wall side8 = new Wall(8,0, "");
  static Wall side9 = new Wall(9,0, "");
  static Wall side10 = new Wall(10,0, "");
  static Wall side11 = new Wall(11,0, "");
  static Wall side12 = new Wall(12,0, "");
  static Wall side13 = new Wall(13,0, "");
  static Wall side14 = new Wall(14,0, "");
  static Wall side15 = new Wall(15,0, "");
  static Wall side16 = new Wall(16,0, "");
  static Wall side17 = new Wall(17,0, "");
  static Wall side18 = new Wall(18,0, "");
  static Wall side19 = new Wall(19,0, "");
  static Wall side20 = new Wall(20,0, "");
  static Wall side21 = new Wall(21,0, "");
  static Wall side22 = new Wall(22,0, "");
  static Wall side23 = new Wall(23,0, "");
  static Wall side24 = new Wall(24,0, "");
  static Wall side25 = new Wall(25,0, "");
  static Wall side26 = new Wall(26,0, "");
  static Wall side27 = new Wall(27,0, "");
  static Wall side28 = new Wall(28,0, "");
  static Wall side29 = new Wall(29,0, "");
  static Wall side30 = new Wall(30,0, "");
  static Wall side31 = new Wall(31,0, "");
  static Wall side32 = new Wall(32,0, "");
  static Wall side33 = new Wall(33,0, "");
  static Wall side34 = new Wall(34,0, "");
  static Wall side35 = new Wall(35,0, "");
  static Wall side36 = new Wall(36,0, "");
  static Wall side37 = new Wall(37,0, "");
  static Wall side38 = new Wall(38,0, "");
  static Wall side39 = new Wall(39,0, "");
  static Wall side40 = new Wall(40,0, "");
  static Wall side41 = new Wall(41,0, "");
  static Wall side42 = new Wall(42,0, "");
  static Wall side43 = new Wall(43,0, "");
  static Wall side44 = new Wall(44,0, "");
  static Wall side45 = new Wall(45,0, "");
  static Wall side46 = new Wall(46,0, "");
  static Wall side47 = new Wall(47,0, "");
  static Wall side48 = new Wall(48,0, "");
  static Wall side49 = new Wall(49,0, "");
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
      greeblers.remove(killed.get(l));
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
        if(greeblers.get(i).getX() - 1 == c.getX() && c.getY() == greeblers.get(i).getY()){
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
        if(greeblers.get(j).getX() + 1 == c.getX() && c.getY() == greeblers.get(j).getY()){
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
        if(greeblers.get(k).getX() == c.getX() && c.getY() == greeblers.get(k).getY() - 1){
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
        if(greeblers.get(l).getX() == c.getX() && c.getY() == greeblers.get(l).getY() + 1){
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
  public static String checkInFront(Creature n){
    for (int i = 0; i < grid.size(); i++){
      //Checks which direction the greebler is looking and then if there is a wall in fron of the creature
      if (n.getDirection().equals("up")){
        if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() - 1){
          return "wall";
        }
      }
      if (n.getDirection().equals("down")){
        if (grid.get(i).getwallX() == n.getX() && grid.get(i).getwallY() == n.getY() + 1){
          return "wall";
        }
      }
      if (n.getDirection().equals("right")){
        if (grid.get(i).getwallX() == n.getX() + 1 && grid.get(i).getwallY() == n.getY()){
          return "wall";
        }
      }
      if (n.getDirection().equals("left")){
        if (grid.get(i).getwallX() == n.getX() - 1 && grid.get(i).getwallY() == n.getY()){
          return "wall";
        }
      }
    }

    //Checks if there is a greebler in the direction of the creature
    for (int i = 0; i < greeblers.size(); i++){
      if (n.getDirection().equals("up")){
        if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() == n.getY() - 1){
          return "greebler";
        }
      }
      if (n.getDirection().equals("down")){
        if (greeblers.get(i).getX() == n.getX() && greeblers.get(i).getY() == n.getY() + 1){
          return "greebler";
        }
      }
      if (n.getDirection().equals("right")){
        if (greeblers.get(i).getX() == n.getX() + 1 && greeblers.get(i).getY() == n.getY()){
          return "greebler";
        }
      }
      if (n.getDirection().equals("left")){
        if (greeblers.get(i).getX() == n.getX() - 1 && greeblers.get(i).getY() == n.getY()){
          return "greebler";
        }
      }
    }

    //checks if there is a baby in front of anything
    for (int i = 0; i < babies.size(); i++){
      if (n.getDirection().equals("up")){
        if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() - 1){
          return "baby";
        }
      }
      if (n.getDirection().equals("down")){
        if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY() + 1){
          return "baby";
        }
      }
      if (n.getDirection().equals("right")){
        if (babies.get(i).getX() == n.getX() + 1 && babies.get(i).getY() == n.getY()){
          return "baby";
        }
      }
      if (n.getDirection().equals("left")){
        if (babies.get(i).getX() == n.getX() - 1 && babies.get(i).getY() == n.getY()){
          return "baby";
        }
      }
    }

    //checks for player in front of creature
    if (n.getDirection().equals("up")){
      if (one.getX() == n.getX() && one.getY() == n.getY() - 1){
        return "player";
      }
    }
    if (n.getDirection().equals("down")){
      if (one.getX() == n.getX() && one.getY() == n.getY() + 1){
        return "player";
      }
    }
    if (n.getDirection().equals("right")){
      if (one.getX() == n.getX() + 1 && one.getY() == n.getY()){
        return "player";
      }
    }
    if (n.getDirection().equals("left")){
      if (one.getX() == n.getX() - 1 && one.getY() == n.getY()){
        return "player";
      }
    }

    return "";
  }




//PickUpBaby(player n, baby1) Allows player to pickup the babies
public static void pickUpBaby(Player n, Terminal t){
  int a = - 1;
  for (int i = 0; i < babies.size(); i++){
    if (babies.get(i).getX() == n.getX() && babies.get(i).getY() == n.getY()){
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
    TerminalSize size =  new TerminalSize(100,200);//terminal.getTerminalSize();
  //  size.setRows(100);
  //  size.setColumns(200);
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
  //    putString(1, 7, terminal, "inFront: " + checkInFront(one));

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
            if (checkInFront(one).equals("baby")){
              one.moveLeft();
              pickUpBaby(one, terminal);
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
          if (checkInFront(one).equals("baby")){
            one.moveRight();
            pickUpBaby(one, terminal);
          }
				}

				if (key.getKind() == Key.Kind.ArrowUp) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("up");
          if (checkInFront(one).equals("")){
					   one.moveUp();
             y--;
          }
          if (checkInFront(one).equals("baby")){
            one.moveUp();
            pickUpBaby(one, terminal);
          }
				}

				if (key.getKind() == Key.Kind.ArrowDown) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("down");
					if (checkInFront(one).equals("")){
					  one.moveDown();
            y++;
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
    }
  }
}
