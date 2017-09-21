import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cave extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new cave().setVisible(true);
  }
  
  public cave() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if (gameScreen2.sword == true)
    {
    JLabel content = new JLabel("It is dark in the cave, you can’t see anything. If only you had a torch or something...");
    add(content);
    
    JLabel content2 = new JLabel("You hear footsteps all around you.");
    add(content2);
    
    JLabel content3 = new JLabel("A dagger pierces your side, and the bandits mercilessly stab you to death.");
    add(content3);
    }
    else
    {
      JLabel content4 = new JLabel("Your staff illuminates the cave, and you see a bandit waiting to ambush you.");
      add(content4);
      
      JLabel content5 = new JLabel("You defeat the bandit and find the stolen treasure.");
      add(content5);
      
      JLabel content6 = new JLabel("You return the treasure to the town. You are a hero!");
      add(content6);
    }
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue") && gameScreen2.sword == true)
          {
      new deathScreen().setVisible(true);
    }
     if (a.equals("Continue") && gameScreen2.sword == false)
     {
       new victory().setVisible(true);
     }
   }
}
  
  
      
 
  
