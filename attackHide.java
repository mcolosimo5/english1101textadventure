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
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    JLabel content = new JLabel("You decide to hide and play it safe.");
    add(content);
    
    JLabel content2 = new JLabel("After a few hours you hear the fighting die down, and you come out of your hiding place.");
    add(content2);
    
    JLabel content3 = new JLabel("The town's people are angry that you did not fight.");
    add(content3);
    
    JLabel content4 = new JLabel("They tell you that the bandits stole their treasure, and you must go retrieve it.");
    add(content4);
    
    JLabel content5 = new JLabel("You leave the town through the gate and see bandits running in all directions.");
    add(content5);
    
    JLabel content6 = new JLabel("Some of them are running to the mountains, some to the swamp, and others to the cave.");
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
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    content6.setForeground(Color.WHITE);
    content7.setForeground(Color.WHITE);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("The Mountains"))
          {
      new mountain().setVisible(true);
      setVisible(false);
    }
    if (a.equals("The Swamp"))
          {
      new swamp().setVisible(true);
      setVisible(false);
    }
    if (a.equals("The Cave"))
          {
      new cave().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
