import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fight extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new fight().setVisible(true);
  }
  
  public fight() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if (gameScreen2.sword == true)
    {
    JLabel content = new JLabel("Inexperienced with your shiny new weapon, you are too slow to attack and are fatally wounded.");
    add(content);
    }
    else
    {
      JLabel content2 = new JLabel("Inexperienced with your new weapon, you are too slow to attack and are fatally wounded.");
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
  
  
      
 
  
