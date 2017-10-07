import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kickRocks extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new kickRocks().setVisible(true);
  }
  
  public kickRocks() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("The rocks and dust blind the monster.");
    add(content);
    
    JLabel content2 = new JLabel("It makes a terrifying noise as you wrap your arms around it and struggle for a moment.");
    add(content2);
    
    JLabel content3 = new JLabel("It bucks you off and stumbles backward.");
    add(content3);
    
    JLabel content4 = new JLabel("You feel your hand resting on a sharp, jagged rock almost perfectly in the shape of a dagger.");
    add(content4);
    
    JLabel content5 = new JLabel("Do you take the rock?");
    add(content5);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    
    JButton yes = new JButton("Yes");
    yes.addActionListener(this);
    add(yes);
    
    JButton no = new JButton("No");
    no.addActionListener(this);
    add(no);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Yes"))
          {
      new takeDagger().setVisible(true);
      setVisible(false);
    }
    if (a.equals("No"))
          {
      new rejectDagger().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
