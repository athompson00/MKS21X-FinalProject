
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

public class Demo{
  private static Wall[] perimeter = new Wall[1000];
  private Greebler[] greeblers = new Greebler[5];
  private Baby[] babies = new Baby[10];
  //fills perimeter with walls with positions that surround
  //the terminal
  private static int wallnum = 0;

  public static void fillPerimeter(Terminal t, Wall[] perimeter){
    for(int i = 0; i < t.getTerminalSize().getRows(); i++){
      Wall wall = new Wall(0, i, "up");
      perimeter[wallnum] = wall;
      wallnum++;
    }
    for(int j = 0; j < t.getTerminalSize().getRows(); j++){
      Wall wall = new Wall(t.getTerminalSize().getColumns(), j, "up");
      perimeter[wallnum] = wall;
      wallnum++;
    }
    for(int k = 0; k < t.getTerminalSize().getColumns(); k++){
      Wall wall = new Wall(k, 0, "side");
      perimeter[wallnum] = wall;
      wallnum++;
    }
    for(int l = 0; l < t.getTerminalSize().getColumns(); l++){
      Wall wall = new Wall(l, t.getTerminalSize().getRows(), "side");
      perimeter[wallnum] = wall;
      wallnum++;
    }
  }

  public static void fillScreen(Terminal t, Wall[] perimeter ){
    for(int i = 0; i < wallnum; i++){
      t.moveCursor(perimeter[i].getwallX(), perimeter[i].getwallY());
      t.putCharacter(perimeter[i].getBarrier());
    }
  }

  public static void putString(int r, int c,Terminal t, String s){
		t.moveCursor(r,c);
		for(int i = 0; i < s.length();i++){
			t.putCharacter(s.charAt(i));
		}
	}
  //checks position in front of creature for a
  //creature, wall, or baby and returns a String with the
  //type of thing in front of it
  public String checkInFront(Creature n){
    for (int i = 0; i < perimeter.length; i++){
      //Checks which direction the greebler is looking and then if there is a wall in fron of the creature
      if (n.getDirection().equals("up")){
        if (perimeter[i].getwallX() == n.getX() && perimeter[i].getwallY() == n.getY() + 1){
          return "Wall";
        }
      }
      if (n.getDirection().equals("down")){
        if (perimeter[i].getwallX() == n.getX() && perimeter[i].getwallY() == n.getY() - 1){
          return "Wall";
        }
      }
      if (n.getDirection().equals("right")){
        if (perimeter[i].getwallX() == n.getX() + 1 && perimeter[i].getwallY() == n.getY()){
          return "Wall";
        }
      }
      if (n.getDirection().equals("left")){
        if (perimeter[i].getwallX() == n.getX() - 1 && perimeter[i].getwallY() == n.getY()){
          return "Wall";
        }
      }
    }

    //Checks if there is a greebler in the direction of the creature
    for (int i = 0; i < greeblers.length; i++){
      if (n.getDirection().equals("up")){
        if (greeblers[i].getX() == n.getX() && greeblers[i].getY() == n.getY() + 1){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("down")){
        if (greeblers[i].getX() == n.getX() && greeblers[i].getY() == n.getY() - 1){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("right")){
        if (greeblers[i].getX() == n.getX() + 1 && greeblers[i].getY() == n.getY()){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("left")){
        if (greeblers[i].getX() == n.getX() - 1 && greeblers[i].getY() == n.getY()){
          return "Greebler";
        }
      }
    }

    //checks if there is a baby in front of anything
    for (int i = 0; i < babies.length; i++){
      if (n.getDirection().equals("up")){
        if (babies[i].getX() == n.getX() && babies[i].getY() == n.getY() + 1){
          return "Baby";
        }
      }
      if (n.getDirection().equals("down")){
        if (babies[i].getX() == n.getX() && babies[i].getY() == n.getY() - 1){
          return "Baby";
        }
      }
      if (n.getDirection().equals("right")){
        if (babies[i].getX() == n.getX() + 1 && babies[i].getY() == n.getY()){
          return "Baby";
        }
      }
      if (n.getDirection().equals("left")){
        if (babies[i].getX() == n.getX() - 1 && babies[i].getY() == n.getY()){
          return "Baby";
        }
      }
    }

    //checks for player in front of creature
    if (n.getDirection().equals("up")){
      if (one.getX() == n.getX() && one.getY() == n.getY() + 1){
        return "Baby";
      }
    }
    if (n.getDirection().equals("down")){
      if (one.getX() == n.getX() && one.getY() == n.getY() - 1){
        return "Baby";
      }
    }
    if (n.getDirection().equals("right")){
      if (one.getX() == n.getX() + 1 && one.getY() == n.getY()){
        return "Baby";
      }
    }
    if (n.getDirection().equals("left")){
      if (one.getX() == n.getX() - 1 && one.getY() == n.getY()){
        return "Baby";
      }
    }

    return "";
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
    System.out.println(perimeter[0].getwallX());
    System.out.println(perimeter[0].getwallY());
    Player one = new Player(1000, 10, x, y, "wallie", '\u00a6', 4);

    while(running){

			terminal.moveCursor(x,y);
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
			terminal.applyBackgroundColor(Terminal.Color.BLUE);
			terminal.applyForegroundColor(Terminal.Color.DEFAULT);


      fillPerimeter(terminal, perimeter);
      fillScreen(terminal, perimeter);

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
					terminal.moveCursor(x,y);
					terminal.putCharacter(' ');
					x--;
					one.moveLeft();
				}

				if (key.getKind() == Key.Kind.ArrowRight) {
					terminal.moveCursor(x,y);
					terminal.putCharacter(' ');
					x++;
					one.moveRight();
				}

				if (key.getKind() == Key.Kind.ArrowUp) {
					terminal.moveCursor(x,y);
					terminal.putCharacter(' ');
					y--;
					one.moveUp();
				}

				if (key.getKind() == Key.Kind.ArrowDown) {
					terminal.moveCursor(x,y);
					terminal.putCharacter(' ');
					y++;
					one.moveDown();
				}
				//space moves it diagonally
				if (key.getCharacter() == ' ') {
					terminal.moveCursor(x,y);

				}
      }
    }
  }
}
