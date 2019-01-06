import javax.swing.JFrame;
public class Display{
  private String title;
  private JFrame initial;
  private int w; //width
  private int h; //height
  public Display(int w, int h, String t){
    title = t;
    this.w = w;
    this.h = h;

    createDisplay();
  }

  //Creating display using Jframe
  public void createDisplay(){
    initial = new JFrame(title); //initializes Jframe
    initial.setSize(w,h);
    initial.setResizable(false); //player cannot change window size
    initial.setVisible(true); //makes Jframe visible
    initial.setLocationRelativeTo(null); //places the frame in the middle of the screen
    initial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes sure program closes
  }
}
