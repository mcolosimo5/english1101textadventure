import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class river extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new river().setVisible(true);
  }
  
  public river() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel("You're trying to cross the river when you stumble on a rock and fall in.");
    add(content);
    
    JLabel content2 = new JLabel("You are swept away by the current. You die.");
    add(content2);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new deathScreen2().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
