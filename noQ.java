import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class noQ extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new noQ().setVisible(true);
  }
  
  public noQ() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    JLabel content = new JLabel("The Gatekeeper Responds 'Hmm... Questionable...'");
    add(content);
    
    JLabel content2 = new JLabel("You hear whispers around you. What do you do?");
    add(content2);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    
    JButton hide = new JButton("Hide Quickly and Quietly");
    hide.addActionListener(this);
    add(hide);
    
    JButton wait = new JButton("Wait for the Gatekeeper");
    wait.addActionListener(this);
    add(wait);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Wait for the Gatekeeper"))
          {
      new waitScreen().setVisible(true);
      setVisible(false);
    }
    else if (a.equals("Hide Quickly and Quietly"))
    {
      new hideScreen().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
