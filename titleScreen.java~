import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class titleScreen extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new titleScreen().setVisible(true);
  }
  
  private titleScreen() {
    super("Welcome");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("Welcome to the Text Adventure");
    add(content);
    
    JButton play = new JButton ("Play");
    play.addActionListener(this);
    
    add(play);
    
    
  }
  
  
      
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Play"))
          {
      new gameScreen2().setVisible(true);
    }
     
    
  }
  
}