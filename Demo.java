
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
  private Wall[] perimeter = new Wall[196];
  //fills perimeter with walls with positions that surround
  //the terminal
  public static void fillPerimeter(Terminal t, Wall[] perimeter){
    int wallnum = 0;
    for(int i = 0; i < t.size.getRows(); i++){
      Wall wall = new Wall(0, i, "up");
      wallnum++;
      perimeter[wallnum] = wall;
    }
    for(int j = 0; j < t.size.getRows(); j++){
      Wall wall = new Wall(t.size.getCols, j, "up");
      wallnum++;
      perimeter[wallnum] = wall;
    }
    for(int k = 0; k < t.size.getCols(); k++){
      Wall wall = new Wall(k, 0, "side");
      wallnum++;
      perimeter[wallnum] = wall;
    }
    for(int l = 0; l < t.size.getCols(); l++){
      Wall wall = new Wall(l, t.size.getRows(), "side");
      wallnum++;
      perimeter[wallnum] = wall;
    }
  }

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
<<<<<<< HEAD
  //checks position in front of creature for a creature, wall, or baby and returns a String with the type of thing in front of it
  public String checkInFront(Creature x){
    int a = x.getX;
    int b = x.getY;
    
=======
  //checks position in front of creature for a
  //creature, wall, or baby and returns a String with the
  //type of thing in front of it
  public String checkInFront(){
    return "";
>>>>>>> f2f8cf7922eff7b14b0df5b8981a8a3112cb04cf
  }
  public static void main(String[] args){
    Terminal terminal = TerminalFacade.createTextTerminal();
    terminal.enterPrivateMode();
    TerminalSize size = terminal.getTerminalSize();
    size.setRows(50);
    size.setColumns(50);
    terminal.setCursorVisible(false);
    boolean running = true;

    fillPerimeter();
    fillScreen();

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
