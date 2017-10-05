import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class oldManForestDeath extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new oldManForestDeath().setVisible(true);
  }
  
  public oldManForestDeath() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content1 = new JLabel("The old man believes you to be lying about your name.");
    add(content1);
    
    JLabel content = new JLabel("He lets the arrow fly. You die..");
    add(content);
    
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
  
  
      
 
  