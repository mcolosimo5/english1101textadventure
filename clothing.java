import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class clothing extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new clothing().setVisible(true);
  }
  
  public clothing() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    JLabel content = new JLabel("You follow the clothing. It was a trap! You get knocked out by something and never wake up...");
    add(content);
    
    JLabel content2 = new JLabel("You die.");
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
  
  
      
 
  
