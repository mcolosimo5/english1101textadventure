import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen2 extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen().setVisible(true);
  }
  
  public gameScreen2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen2 = new JLabel("A man is walking through a dark forest. There is a split in the path. The man decides to...");
    add(contentGameScreen2);
    
    JButton goLeft = new JButton ("Go to the Left");
    goLeft.addActionListener(this);
    
    JButton goRight = new JButton ("Go to the Right");
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