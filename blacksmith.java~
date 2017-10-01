import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class blacksmith extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new blacksmith().setVisible(true);
  }
  
  public blacksmith() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You enter the blacksmith's shop. A gruff locking man asks What do you want?");
    add(content);
    
    JLabel content2 = new JLabel("                              You are nervous, and say nothing. The man laughs and hands you a sword.                               ");
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
      gameScreen2.sword = true;
      new gameScreen3().setVisible(true);
    }
   }
}
  
  
      
 
  
