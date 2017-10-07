import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rejectDagger extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new rejectDagger().setVisible(true);
  }
  
  public rejectDagger() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("You lunge at the deamon unarmed. The monster easily pushes you aside and slashes you with its claws.");
    add(content);
    
    JLabel content2 = new JLabel("You die.");
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
      new deathScreen3().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
