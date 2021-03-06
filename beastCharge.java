import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class beastCharge extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new beastCharge().setVisible(true);
  }
  
  public beastCharge() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("The beast does not flinch as you suddenly rush towards it, and a horrible fear seizes you.");
    add(content);
    
    JLabel content2 = new JLabel("You connect with the demon and send it gliding backwards toward the portal as if you were pushing a sled across icy snow.");
    add(content2);
    
    JLabel content3 = new JLabel("The demon seems drawn to the portal as if it is beckoning him.");
    add(content3);
    
    JLabel content4 = new JLabel("As the portal swallows the evil figure, its expression transforms into a terrible grin, almost as if it is thanking you.");
    add(content4);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new level1Return().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
