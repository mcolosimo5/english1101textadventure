import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class killedByVillagers extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new killedByVillagers().setVisible(true);
  }
  
  public killedByVillagers() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("The villagers are upset that you will not help them. They call you a traitor.");
    add(content);
    
    JLabel content2 = new JLabel("You are murdered in your sleep.");
    add(content2);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new deathScreen2().setVisible(true);
    }
   }
}
  
  
      
 
  
