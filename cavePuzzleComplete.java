import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cavePuzzleComplete extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new cavePuzzleComplete().setVisible(true);
  }
  
  public cavePuzzleComplete() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("You follow the blood. It was a trap!");
    add(content);
    
    JLabel content2 = new JLabel("Something leaps out from behind you and hits you over the head. You die.");
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
    
    new deathScreen3().setVisible(true);
    setVisible(false);
   }
}
  
  
      
 
  
