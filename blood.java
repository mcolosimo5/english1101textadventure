import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class blood extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new blood().setVisible(true);
  }
  
  public blood() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You follow the blood. It was a trap!");
    add(content);
    
    JLabel content2 = new JLabel("Something leaps out from behind you and hits you over the head. You die.");
    add(content2);
    
    
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    new deathScreen2().setVisible(true);
   }
}
  
  
      
 
  
