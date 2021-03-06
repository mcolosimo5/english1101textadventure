import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class blacksmith extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  public static boolean bow = true;
  
  public static void main (String args [])
  {
    new blacksmith().setVisible(true);
  }
  
  public blacksmith() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    JLabel content = new JLabel("You enter the blacksmith's shop. A gruff looking man asks, 'What do you want?'");
    add(content);
    
    JLabel content2 = new JLabel("You are nervous, and say nothing. The man laughs and says 'Would you like a sword or a bow and arrows?'");
    add(content2);
    
    JLabel content3 = new JLabel("The bow is light and versatile.");
    add(content3);
    
    JLabel content4 = new JLabel("The sword is made of dwarvish metals mined from the mountains. It is strong and sturdy.");
    add(content4);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
   
    JButton sword = new JButton("Sword");
    sword.addActionListener(this);
    add(sword);
    
    JButton bow = new JButton("Bow");
    bow.addActionListener(this);
    add(bow);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Sword"))
          {
      gameScreen2.sword = true;
      bow = false;
      new blacksmith2().setVisible(true);
      setVisible(false);
    }
    if (a.equals("Bow"))
          {
      gameScreen2.sword = false;
      bow = true;
      new blacksmith2().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
