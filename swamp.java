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
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    if (gameScreen2.sword == true)
    {
    JLabel content = new JLabel("You chase the bandits into the swamp.");
    add(content);
    
    JLabel content2 = new JLabel("As you chase them through the swamp, you slowly sink into the swamp because of the weight of your sword.");
    add(content2);
    
    JLabel content3 = new JLabel("You cannot move. You starve to death.");
    add(content3);
    
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content.setForeground(Color.WHITE);
    
    }
    else if (blacksmith.bow == true)
    {
      JLabel content4 = new JLabel("You shoot the bandits as they run into the swamp.");
      add(content4);
      
      JLabel content5 = new JLabel("You retrieve the treasure and return it to the townspeople. You are a hero!");
      add(content5);
      
      content4.setForeground(Color.WHITE);
      content5.setForeground(Color.WHITE);
    }
    else
    {
      JLabel content6 = new JLabel("You chase the bandits into the swamp.");
    add(content6);
    
    JLabel content7 = new JLabel("As you chase them through the swamp, your staff gets caught in the swamp.");
    add(content7);
    
    JLabel content8 = new JLabel("You cannot move. You starve to death.");
    add(content8);
    
    content7.setForeground(Color.WHITE);
    content8.setForeground(Color.WHITE);
    content6.setForeground(Color.WHITE);
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
  
  
      
 
  
