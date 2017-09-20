import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen2 extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen2().setVisible(true);
  }
  
  public gameScreen2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen = new JLabel("The old man’s stern expression transforms to one of respect and reverence.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("He hurriedly opens the gate and welcomes you inside…"); 
    add(contentGameScreen2);
    
    JLabel contentGameScreen3 = new JLabel("The town doesn’t have many buildings, but you notice the warm glow of the furnace coming from the dusty blacksmith hut."); 
    add(contentGameScreen3);
    
    JLabel contentGameScreen4 = new JLabel("The rest of the town seems to be built around a temple to some unknown diety populated by friendly-looking monks.");
    add(contentGameScreen4);
    
    JLabel contentGameScreen5 = new JLabel("The old man pushes you toward in the direction of those two alluring buildings.To which to do you go?      ");
    add(contentGameScreen5);
    
    JButton goLeft = new JButton ("The Temple");
    goLeft.addActionListener(this);
    
    JButton goRight = new JButton ("The Blacksmith's Hut");
    goRight.addActionListener(this);
    
    add(goRight);
    add(goLeft);
    
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Go to the Left"))
          {
      new gameScreen().setVisible(true);
    }
    else if (a.equals("Go to the Right"))
          {
      
    }
     
    
  }
}