import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swamp extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new swamp().setVisible(true);
  }
  
  public swamp() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You chase the bandit into the swamp.");
    add(content);
    
    JLabel content2 = new JLabel("As you chase the bandit through the swamp, your foot gets stuck in the mud.");
    add(content2);
    
    JLabel content3 = new JLabel("You can’t move. You starve to death.");
    add(content3);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new deathScreen().setVisible(true);
    }
   }
}
  
  
      
 
  
