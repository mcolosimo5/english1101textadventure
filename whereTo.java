import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class whereTo extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  public static String weapon = "";
  
  public static void main (String args [])
  {
    new whereTo().setVisible(true);
  }
  
  public whereTo() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel("Now that you have your " + gameScreen4.weapon + ", it is time to search for the killer.");
    add(content);
    
    JLabel content1 = new JLabel("The villagers all have different opinions of where you should start the search.");
    add(content1);
    
    JLabel content2 = new JLabel("Some say you should to go to the forest, others say a cave, and some say the graveyard.");
    add(content2);
    
    JLabel content3 = new JLabel("Where do you go?");
    add(content3);
    
    content.setForeground(Color.WHITE);
    content1.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    
    JButton forest = new JButton("The Forest");
    forest.addActionListener(this);
    add(forest);
      
    JButton cave = new JButton("The Cave");
    cave.addActionListener(this);
    add(cave);
    
    JButton graveyard = new JButton("The Graveyard");
    graveyard.addActionListener(this);
    add(graveyard);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("The Forest"))
          {
      new forest().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("The Cave"))
      {
      new cave2().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("The Graveyard"))
      {
      new graveyard().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
