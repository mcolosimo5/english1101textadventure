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
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JButton level1 = new JButton ("Level 1");
    level1.addActionListener(this);
    
    JButton level2 = new JButton ("Level 2");
    level2.addActionListener(this);
    
    JButton level3 = new JButton ("Level 3");
    level3.addActionListener(this);
    
    add(level1);
    add(level2);
    add(level3);
    
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Level 1"))
          {
      new gameScreen().setVisible(true);
    }
    else if (a.equals("Level 2"))
          {
      new gameScreen2().setVisible(true);
    }
    else if(a.equals("Level 3") );
              {
    }
  }
}