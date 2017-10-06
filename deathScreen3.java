import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class deathScreen3 extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  public static int deathCount3 = 0;
  
  public static void main (String args [])
  {
    new deathScreen3().setVisible(true);
  }
  
  public deathScreen3() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    
    JLabel contentGameScreen = new JLabel("You chose the wrong option and died.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("Would you like to try again?");
    add(contentGameScreen2);
    
    contentGameScreen.setForeground(Color.WHITE);
    contentGameScreen2.setForeground(Color.WHITE);
    
    JButton yes = new JButton("Yes");
    yes.addActionListener(this);
    add(yes);
    
    JButton no = new JButton("No");
    no.addActionListener(this);
    add(no);
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Yes"))
          {
      deathCount3 = deathCount3 +1;
      new gameScreen5().setVisible(true);
      setVisible(false);
    }
     
    else if (a.equals("No"))
   {
      new levelScreen().setVisible(true);
      setVisible(false);
    }
      
  }
}