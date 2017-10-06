import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class victory2 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new victory2().setVisible(true);
  }
  
  public victory2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel("You Completed Level 2!");
    add(content);
    
    JLabel content2 = new JLabel("You died " + deathScreen2.deathCount2 + " times while completing level 2.");
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
  
  
      
 
  
