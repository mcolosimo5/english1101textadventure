import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class victory extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new victory().setVisible(true);
  }
  
  public victory() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You Completed Level 1!");
    add(content);
    
    JButton cont = new JButton("Return to Level Menu");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Return to Level Menu"))
          {
      new levelScreen().setVisible(true);
    }
   }
}
  
  
      
 
  