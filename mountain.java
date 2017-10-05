import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mountain extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new mountain().setVisible(true);
  }
  
  public mountain() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if(gameScreen2.sword == true)
    {
      JLabel content4 = new JLabel("You arrive at the mountain and see the bandits climbing the mountain.");
      add(content4);
      
      JLabel content5 = new JLabel("One of them slips and causes a landslide.");
      add(content5);
      
      JLabel content6 = new JLabel("The bandits are swept away, but you are able to anchor yourself with your sword and hang on.");
      add(content6);
      
      JLabel content7 = new JLabel("You retrieve the treasure and return it to the townspeople. You are a hero!");
      add(content7);
    }
    
    else
    {
      
    JLabel content = new JLabel("You arrive at the mountain and start to climb.");
    add(content);
    
    JLabel content2 = new JLabel("As you climb the mountain, you slip on a loose rock and cause a landslide.");
    add(content2);
    
    JLabel content3 = new JLabel("You and the bandits are buried under miles of earth. You die.");
    add(content3);
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
      new victory().setVisible(true);
    }
    else
          {
      new deathScreen().setVisible(true);
    }
   }
}
  
  
      
 
  
