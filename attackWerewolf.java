import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class attackWerewolf extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new attackWerewolf().setVisible(true);
  }
  
  public attackWerewolf() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    if (gameScreen4.weapon.equals("axe"))
    {
    JLabel content = new JLabel("You chase the werewolf with your bronze axe. You swing your axe at the werewolf.");
    add(content);
    
    JLabel content2 = new JLabel("You clearly made contact with the werewolf, but it looks like it did not feel anything!");
    add(content2);
    
    JLabel content3 = new JLabel("It luges at you with its claws. You die.");
    add(content3);
    }
    else if (gameScreen4.weapon.equals("torch"))
    {
      JLabel content4 = new JLabel("You attack the werewolf with your torch.");
      add(content4);
      
      JLabel content5 = new JLabel("You try to burn the wereolf, but your torch does nothing to it.");
      add(content5);
      
      JLabel content6 = new JLabel("The werewolf attacks you, and you die.");
      add(content6);
    }
    else
    {
      JLabel content7 = new JLabel("You chase the werewolf with your silver sword.");
      add(content7);
      
      JLabel content8 = new JLabel("It attacks you with its claws, but you use your sword to block its attack.");
      add(content8);
      
      JLabel content9 = new JLabel("You then push the werewolf back and stab it with your sword. The werewolf cries in pain and runs away.");
      add(content9);
    }
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue") && (gameScreen4.weapon.equals("axe") || gameScreen4.weapon.equals("torch")))
          {
      new deathScreen2().setVisible(true);
    }
     if (a.equals("Continue") && (gameScreen4.weapon.equals("sword")))
     {
       new victory().setVisible(true);
     }
   }
}
  
  
      
 
  
