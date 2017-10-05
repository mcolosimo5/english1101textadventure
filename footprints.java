import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class footprints extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new footprints().setVisible(true);
  }
  
  public footprints() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    JLabel content = new JLabel("You follow the footprints. They lead you down a strange path.");
    add(content);
    
    JLabel content2 = new JLabel("You turn a corner when you suddenly see a wolf-like creature standing in front of you.");
    add(content2);
    
    JLabel content3 = new JLabel("It's a werewolf! Do you wait for the werewolf to make the first move, or do you attack?");
    add(content3);
    
    JButton attack = new JButton("Attack");
    attack.addActionListener(this);
    add(attack);
    
    JButton wait = new JButton("Wait");
    wait.addActionListener(this);
    add(wait);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Wait"))
          {
      new wereWolfWait().setVisible(true);
    }
    if (a.equals("Bow"))
          {
      new blacksmith2().setVisible(true);
    }
   }
}
  
  
      
 
  
