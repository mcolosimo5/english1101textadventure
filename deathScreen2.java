import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class deathScreen2 extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new deathScreen2().setVisible(true);
  }
  
  public deathScreen2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen = new JLabel("You chose the wrong option and died.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("Would you like to try again?");
    add(contentGameScreen2);
    
    JButton yes = new JButton("Yes");
    yes.addActionListener(this);
    add(yes);
    
    JButton no = new JButton("No");
    no.addActionListener(this);
    add(no);
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Yes"))
          {
      new backstory2().setVisible(true);
    }
     
    else if (a.equals("No"))
   {
      new levelScreen().setVisible(true);
    }
      
  }
}