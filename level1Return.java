import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class level1Return extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new level1Return().setVisible(true);
  }
  
  public level1Return() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("Suddenly the fog lifts, and your mind clears.");
    add(content);
    
    JLabel content2 = new JLabel("The portal has disappeared along with all traces of the beast..");
    add(content2);
    
    JLabel content3 = new JLabel("You feel that you could easily navigate your way out of the cave.");
    add(content3);
    
    JLabel content4 = new JLabel("You make your way back to the town, or at least where you thought the town was…");
    add(content4);
    
    JLabel content5 = new JLabel("You keep walking until you pass out under an old oak tree from exhaustion.");
    add(content5);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new backstory().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
