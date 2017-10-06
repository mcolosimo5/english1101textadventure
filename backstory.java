import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class backstory extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new backstory().setVisible(true);
  }
  
  public backstory() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    
    JLabel content = new JLabel("You wake up under an old oak tree in a spacious forest.");
    add(content);
    
    JLabel content4 = new JLabel("You're lying on the ground, and your clothes are tattered and dirty.");
    add(content4);
       
    JLabel content2 = new JLabel("There is a small creek to your left. You get up and walk towards the stream.");
    add(content2);
   
    JLabel content5 = new JLabel("You walk along the stream towards the east for a while, and then find a small dirt path.");
    add(content5);
    
    JLabel content6 = new JLabel("You start to walk southeast along the path.");
    add(content6);
    
    content.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    content6.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new gameScreen().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
