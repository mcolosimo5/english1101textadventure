import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cave2 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void cave2 (String args [])
  {
    new cave2().setVisible(true);
  }
  
  public cave2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if((gameScreen4.weapon).equals("sword") ||  (gameScreen4.weapon).equals("axe"))
    {
      JLabel content4 = new JLabel("You wander into the cave. It is very dark, and you cannot see anything.");
      add(content4);
      
      JLabel content5 = new JLabel("You fall into a dark pit and die.");
      add(content5);
    }
    
    else
    {
      
    JLabel content = new JLabel("You wander into the cave, holding out your torch for light.");
    add(content);
    
    JLabel content2 = new JLabel("About one hundred feet in front of you, you see a thin waterfall blocking your path;.");
    add(content2);
    
    JLabel content3 = new JLabel("You go through the waterfall to see what is behind it and your torch is put out.");
    add(content3);
    
    JLabel content4 = new JLabel("You wander around this side of the cave in the dark for a while in hopes of finding a clue.");
    add(content4);
    
    JLabel content5 = new JLabel("Whenever you decide to leave, you cannot find your way out of the cave. You starve to death.");
    add(content5);
    }
    
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
  
  
      
 
  
