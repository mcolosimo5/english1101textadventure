import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class instructions extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new instructions().setVisible(true);
  }
  
  public instructions() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(Color.DARK_GRAY);
    
    JLabel content = new JLabel("Navigate the game and make decisions by clicking buttons and entering text.");
    add(content);
    
    JLabel content4 = new JLabel("Don’t worry if you lose: winning on the first try is no guarantee.");
    add(content4);
       
    JLabel content2 = new JLabel("In fact, the game is designed to test your resilience in the face of failure.");
    add(content2);
    
    content.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
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
      new levelScreen().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
