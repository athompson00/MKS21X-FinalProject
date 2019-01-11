
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
  static Wall[] perimeter = new Wall[16];
  static Greebler[] greeblers = new Greebler[5];
  static Baby[] babies = new Baby[10];
  static Player one = new Player(1000, 10, 10, 10, "wallie", '\u00a6', 4);

  //perimeter
  Wall side0 = new Wall(0,0, "side");
  Wall side1 = new Wall(0,1, "side");
  Wall side2 = new Wall(0,2, "side");
  Wall side3 = new Wall(0,3, "side");
  Wall side4 = new Wall(0,4, "side");
  Wall side5 = new Wall(0,5, "side");
  Wall side6 = new Wall(0,6, "side");
  Wall side7 = new Wall(0,7, "side");
  Wall side8 = new Wall(0,8, "side");
  Wall side9 = new Wall(0,9, "side");
  Wall side10 = new Wall(0,10, "side");
  Wall side11 = new Wall(0,11, "side");
  Wall side12 = new Wall(0,12, "side");
  Wall side13 = new Wall(0,13, "side");
  Wall side14 = new Wall(0,14, "side");
  Wall side15 = new Wall(0,15, "side");

  /perimeter[0] = side0;
  perimeter[1] = side1;
  perimeter[2] = side2;
  perimeter[3] = side3;
  perimeter[4] = side4;
  perimeter[5] = side5;
  perimeter[6] = side6;
  perimeter[7] = side7;
  perimeter[8] = side8;
  perimeter[9] = side9;
  perimeter[10] = side10;
  perimeter[11] = side11;
  perimeter[12] = side12;
  perimeter[13] = side13;
  perimeter[14] = side14;
  perimeter[15] = side15;*/

  public static void fillScreen(Terminal t, Wall[] perimeter ){
    for(int i = 0; i < perimeter.length; i++){
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
  //commented out and moved to creature class
  public String checkInFront(Creature n){
    for (int i = 0; i < perimeter.length; i++){
      //Checks which direction the greebler is looking and then if there is a wall in fron of the creature
      if (n.getDirection().equals("Up")){
        if (perimeter[i].getwallX() == n.getX() && perimeter[i].getwallY() == n.getY() + 1){
          return "Wall";
        }
      }
      if (n.getDirection().equals("Down")){
        if (perimeter[i].getwallX() == n.getX() && perimeter[i].getwallY() == n.getY() - 1){
          return "Wall";
        }
      }
      if (n.getDirection().equals("Right")){
        if (perimeter[i].getwallX() == n.getX() + 1 && perimeter[i].getwallY() == n.getY()){
          return "Wall";
        }
      }
      if (n.getDirection().equals("Left")){
        if (perimeter[i].getwallX() == n.getX() - 1 && perimeter[i].getwallY() == n.getY()){
          return "Wall";
        }
      }
    }

    //Checks if there is a greebler in the direction of the creature
    for (int i = 0; i < greeblers.length; i++){
      if (n.getDirection().equals("Up")){
        if (greeblers[i].getX() == n.getX() && greeblers[i].getY() == n.getY() + 1){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("Down")){
        if (greeblers[i].getX() == n.getX() && greeblers[i].getY() == n.getY() - 1){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("Right")){
        if (greeblers[i].getX() == n.getX() + 1 && greeblers[i].getY() == n.getY()){
          return "Greebler";
        }
      }
      if (n.getDirection().equals("Left")){
        if (greeblers[i].getX() == n.getX() - 1 && greeblers[i].getY() == n.getY()){
          return "Greebler";
        }
      }
    }

    //checks if there is a baby in front of anything
    for (int i = 0; i < babies.length; i++){
      if (n.getDirection().equals("Up")){
        if (babies[i].getX() == n.getX() && babies[i].getY() == n.getY() + 1){
          return "Baby";
        }
      }
      if (n.getDirection().equals("Down")){
        if (babies[i].getX() == n.getX() && babies[i].getY() == n.getY() - 1){
          return "Baby";
        }
      }
      if (n.getDirection().equals("Right")){
        if (babies[i].getX() == n.getX() + 1 && babies[i].getY() == n.getY()){
          return "Baby";
        }
      }
      if (n.getDirection().equals("Left")){
        if (babies[i].getX() == n.getX() - 1 && babies[i].getY() == n.getY()){
          return "Baby";
        }
      }
    }

    //checks for player in front of creature
    if (n.getDirection().equals("Up")){
      if (one.getX() == n.getX() && one.getY() == n.getY() + 1){
        return "Baby";
      }
    }
    if (n.getDirection().equals("Down")){
      if (one.getX() == n.getX() && one.getY() == n.getY() - 1){
        return "Baby";
      }
    }
    if (n.getDirection().equals("Right")){
      if (one.getX() == n.getX() + 1 && one.getY() == n.getY()){
        return "Baby";
      }
    }
    if (n.getDirection().equals("Left")){
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
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("Left");
          if (one.checkInFront().equals("")){
				        one.moveLeft();
            }
				}

				if (key.getKind() == Key.Kind.ArrowRight) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("Right");
          if (one.checkInFront().equals("")){
					   one.moveRight();
          }
				}

				if (key.getKind() == Key.Kind.ArrowUp) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("Up");
          if (one.checkInFront().equals("")){
					   one.moveUp();
          }
				}

				if (key.getKind() == Key.Kind.ArrowDown) {
					terminal.moveCursor(one.getX(),one.getY());
					terminal.putCharacter(' ');
          one.setDirection("Down");
					if (one.checkInFront().equals("")){
					  one.moveDown();
          }
				}
				//space moves it diagonally
				if (key.getCharacter() == ' ') {
					terminal.moveCursor(one.getX(),one.getY());

				}
      }
    }
  }
}
