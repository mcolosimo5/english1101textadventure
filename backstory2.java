import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class backstory2 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new backstory2().setVisible(true);
  }
  
  public backstory2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel(" The village throws a celebration for you because you saved the village from the bandits.");
    add(content);
    
    JLabel content4 = new JLabel("After many hours a partying you decide to go home. You wander down the street lit up by the full moon.");
    add(content4);
       
    JLabel content2 = new JLabel("The next morning you wake up to yelling from the streets. You hear people yelling “There’s been a murder!”");
    add(content2);
   
    JLabel content5 = new JLabel("You run out into the street and see a crowd of people around a mangled body.");
    add(content5);
    
    JLabel content6 = new JLabel("The villagers, impressed with your success with capturing the bandits, turn to you for help.");
    add(content6);

    JLabel content7 = new JLabel("What do you do?");
    add(content7);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    content6.setForeground(Color.WHITE);
    content7.setForeground(Color.WHITE);
      
    JButton wait = new JButton("Let the Guards Investigate");
    wait.addActionListener(this);
    add(wait);
    
    JButton help = new JButton("Assist in the Investigation");
    help.addActionListener(this);
    add(help);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Let the Guards Investigate"))
          {
      new killedByVillagers().setVisible(true);
      setVisible(false);
      
    }
    else if(a.equals("Assist in the Investigation"))
      {
      new gameScreen4().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
