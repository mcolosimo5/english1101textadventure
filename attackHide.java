import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class attackHide extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new attackHide().setVisible(true);
  }
  
  public attackHide() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You decide to hide and play it safe");
    add(content);
    
    JLabel content2 = new JLabel("After a few hours you hear the fighting die down, and you come out of your hiding place.");
    add(content2);
    
    JLabel content3 = new JLabel("The town�s people are angry that you did not fight.");
    add(content3);
    
    JLabel content4 = new JLabel("They tell you that you must go and find the bandits that ran off with all the treasure.");
    add(content4);
    
    JLabel content5 = new JLabel("You leave the town through the gate and see bandits running in all directions");
    add(content5);
    
    JLabel content6 = new JLabel("- to the mountains, the swamp, the lake, and the cave.");
    add(content6);
    
    JLabel content7 = new JLabel("Where do you go?");
    add(content7);
    
    JButton mountains = new JButton("The Mountains");
    mountains.addActionListener(this);
    add(mountains);
    
    JButton swamp = new JButton("The Swamp");
    swamp.addActionListener(this);
    add(swamp);
    
    JButton cave = new JButton("The Cave");
    cave.addActionListener(this);
    add(cave);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("The Mountains"))
          {
      new mountain().setVisible(true);
    }
    if (a.equals("The Swamp"))
          {
      new swamp().setVisible(true);
    }
    if (a.equals("The Cave"))
          {
      new cave().setVisible(true);
    }
   }
}
  
  
      
 
  
