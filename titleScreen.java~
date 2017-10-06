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
    getContentPane().setBackground(Color.DARK_GRAY);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    JLabel content = new JLabel("Welcome to Deja Vu");
    content.setForeground(Color.WHITE);
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
      new levelScreen().setVisible(true);
    }
     
    
  }
  
}