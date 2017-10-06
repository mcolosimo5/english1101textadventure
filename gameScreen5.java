import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen5 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen5().setVisible(true);
  }
  
  public gameScreen5() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("The werewolf has run into the cave. You are at the mouth of the cave.");
    add(content);
    
    JLabel content2 = new JLabel("You can either wait for the villagers to come help you or chase the beast yourself.");
    add(content2);
    
    JLabel content3 = new JLabel("What do you do?");
    add(content3);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    
    JButton wait = new JButton("Wait for Assistance");
    wait.addActionListener(this);
    add(wait);
      
    JButton chase = new JButton("Chase the Beast");
    chase.addActionListener(this);
    add(chase);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Wait for Assistance"))
          {
      new uselessVillagers().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("Chase the Beast"))
      {
      new chase2().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
