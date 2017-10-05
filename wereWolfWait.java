import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wereWolfWait extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new wereWolfWait().setVisible(true);
  }
  
  public wereWolfWait() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    JLabel content = new JLabel("You wait for the werewolf to make the first move.");
    add(content);
    
    JLabel content2 = new JLabel("It attacks and catches you off guard. It slashes you to death with its claws.");
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
  
  
      
 
  
