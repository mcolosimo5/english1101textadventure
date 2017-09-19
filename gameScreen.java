import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen extends JFrame  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen().setVisible(true);
  }
  
  public gameScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen = new JLabel("After what seems like an eternity of wandering, you arrive at a small, unimpressive town.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("An old man, possibly the gate keeper, approaches you. He wants to know your name… What do you tell him?");
    add(contentGameScreen2);
    
    JTextField name = new JTextField(20);
    add(name);
  }
}