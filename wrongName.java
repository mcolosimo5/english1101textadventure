import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class wrongName extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new wrongName().setVisible(true);
  }
  
  public wrongName() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if (gameScreen2.sword == false && blacksmith.bow == false)
    {
    JLabel content = new JLabel("You have signed another's name. You are not worthy of the Elder's Staff");
    add(content);
    
    JLabel content2 = new JLabel("You die.");
    add(content2);
    }
    else
    {
    JLabel content = new JLabel("The blacksmith believes you are lying about your name.");
    add(content);
    
    JLabel content2 = new JLabel("He pulls out a sword and kills you.");
    add(content2);
    }
    
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
  
  
      
 
  
