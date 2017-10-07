import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class victory3 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new victory3().setVisible(true);
  }
  
  public victory3() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("Congratulations! You Completed Level 3 and beat Deja Vu!");
    add(content);
    
    JLabel content2 = new JLabel("You died " + deathScreen3.deathCount3 + " times while completing level 3, and " + (deathScreen.deathCount1 + deathScreen2.deathCount2 + deathScreen3.deathCount3) + " times throughout the entire game.");
    add(content2);
    
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    
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
      setVisible(false);
    }
   }
}
  
  
      
 
  
