import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class temple extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new temple().setVisible(true);
  }
  
  public temple() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("          You enter the temple. The priest offers you a glowing stick and says ÒIt has magical abilities, use it well.Ó                    ");
    add(content);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      gameScreen2.sword = false;
      new gameScreen3().setVisible(true);
    }
   }
}
  
  
      
 
  
