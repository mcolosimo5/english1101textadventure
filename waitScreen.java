import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class waitScreen extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new waitScreen().setVisible(true);
  }
  
  public waitScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    JLabel content = new JLabel("The gatekeeper becomes impatient and yells to his archers to shoot. You die.");
    add(content);
    
    content.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new deathScreen().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
