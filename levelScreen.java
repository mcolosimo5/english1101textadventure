import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class levelScreen extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new levelScreen().setVisible(true);
  }
  
  public levelScreen() {
    super("Play Game");
    setSize(600, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JButton level1 = new JButton ("Level 1");
    goLeft.addActionListener(this);
    
    JButton level2 = new JButton ("Level 2");
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