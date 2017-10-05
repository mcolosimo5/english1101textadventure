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
    
    if (gameScreen2.sword == true)
    {
    JLabel content = new JLabel("You chase the bandits into the swamp.");
    add(content);
    
    JLabel content2 = new JLabel("As you chase them through the swamp, you slowly sink into the swamp because of the weight of your sword.");
    add(content2);
    
    JLabel content3 = new JLabel("You cannot move. You starve to death.");
    add(content3);
    }
    else if (blacksmith.bow == true)
    {
      JLabel content4 = new JLabel("You shoot the bandits as they run into the swamp.");
      add(content4);
      
      JLabel content5 = new JLabel("You retrieve the treasure and return it to the townspeople. You are a hero.");
      add(content5);
    }
    else
    {
      JLabel content6 = new JLabel("You chase the bandits into the swamp.");
    add(content6);
    
    JLabel content7 = new JLabel("As you chase them through the swamp, your staff gets caught in the swamp.");
    add(content7);
    
    JLabel content8 = new JLabel("You cannot move. You starve to death.");
    add(content8);
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
    else if (a.equals("Continue") && blacksmith.bow == true)
          {
      new victory().setVisible(true);
    }
    else
    {
      new deathScreen().setVisible(true);
    }
   }
}
  
  
      
 
  
