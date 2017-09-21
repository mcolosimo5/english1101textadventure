import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class backstory extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new backstory().setVisible(true);
  }
  
  public backstory() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("You wake up under an old oak tree in a spacious forest.");
    add(content);
       
    JLabel content2 = new JLabel("A small creak is trickling past about 30 feet to the left of you.");
    add(content2);
   
    JLabel content4 = new JLabel("You get up and see that your clothes are tattered and dirty.");
    add(content4);
    
    JLabel content5 = new JLabel("You walk along the stream for about a while, and then find a small dirt path and start to walk southeast along the path.");
    add(content5);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new gameScreen().setVisible(true);
    }
   }
}
  
  
      
 
  
