import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class fight extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new fight().setVisible(true);
  }
  
  public fight() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    if (gameScreen2.sword == true)
    {
    JLabel content = new JLabel("Inexperienced with your shiny new weapon, you are too slow to attack and are fatally wounded.");
    add(content);
    
    content.setForeground(Color.WHITE);
    }
    else
    {
      JLabel content2 = new JLabel("Inexperienced with your new weapon, you are too slow to attack and are fatally wounded.");
      add(content2);
      
      content2.setForeground(Color.WHITE);
    }
    
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
  
  
      
 
  
