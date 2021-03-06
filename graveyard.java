import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class graveyard extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new graveyard().setVisible(true);
  }
  
  public graveyard() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    if((gameScreen4.weapon).equals("sword") ||  (gameScreen4.weapon).equals("axe"))
    {
      JLabel content4 = new JLabel("You wander into the graveyard. You hear strange shuffling noises all around you.");
      add(content4);
      
      JLabel content5 = new JLabel("You feel something grab your leg. A hand has come out of the ground and is tightly gripping your leg.");
      add(content5);
                                   
      JLabel content6 = new JLabel("You are unable to move. You grab your " + gameScreen4.weapon + " and cut off the hand.");
      add(content6);  
      
      JLabel content9 = new JLabel("While you are immobilized, the shuffling grows louder.");
      add(content9);   
      
      JLabel content7 = new JLabel("You start to run away but are surrounded by a large group of strange looking people.");
      add(content7); 
      
      JLabel content8 = new JLabel("They kill you.");
      add(content8); 
      
      content4.setForeground(Color.WHITE);
      content5.setForeground(Color.WHITE);
      content6.setForeground(Color.WHITE);
      content9.setForeground(Color.WHITE);
      content7.setForeground(Color.WHITE);
      content8.setForeground(Color.WHITE);
    }
    
    else
    {
      
      JLabel content = new JLabel("You wander into the graveyard. Your torch lights up the graveyard around you.");
      add(content);
      
      JLabel content1 = new JLabel("You see many people walking around in taterred clothes. You decide to leave.");
      add(content1);
                                   
      JLabel content2 = new JLabel("As you turn to leave, a hand comes up from the ground and grabs your leg.");
      add(content2);  
      
      JLabel content3 = new JLabel("You are immobilized, and the people swarm around you. They kill you.");
      add(content3); 
      
       content.setForeground(Color.WHITE);
       content1.setForeground(Color.WHITE);
       content2.setForeground(Color.WHITE);
       content3.setForeground(Color.WHITE);
 
      
    }
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    new deathScreen2().setVisible(true);
    setVisible(false);
   }
}
  
  
      
 
  
