import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen3 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen3().setVisible(true);
  }
  
  public gameScreen3() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    if (gameScreen2.sword == true || blacksmith.bow == true)
    {
    JLabel contentGameScreen = new JLabel("As you wander out of the blacksmith's hut toward the lively tavern to have a well deserved pint,");
    add(contentGameScreen);
    
    contentGameScreen.setForeground(Color.WHITE);
    }
    else
    {
    JLabel contentGameScreen = new JLabel("As you wander out of the temple toward the lively tavern to have a well deserved pint,");
    add(contentGameScreen);
    
    contentGameScreen.setForeground(Color.WHITE);
    }
    
    JLabel contentGameScreen4 = new JLabel("you hear the old gatekeeper frantically ringing the alarm bell..");
    add(contentGameScreen4);
    
    contentGameScreen4.setForeground(Color.WHITE);
    
    JLabel contentGameScreen2 = new JLabel("Nimble bandits swarm over the walls and into the town.");
    add(contentGameScreen2);
    
    contentGameScreen2.setForeground(Color.WHITE);

    JLabel contentGameScreen3 = new JLabel("What do you do?");
    add(contentGameScreen3);
    
    contentGameScreen3.setForeground(Color.WHITE);
    
    
    JButton hideAgain = new JButton("Hide");
    hideAgain.addActionListener(this);
    add(hideAgain);
    
    JButton fight = new JButton("Fight");
    fight.addActionListener(this);
    add(fight);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Hide"))
          {
      new attackHide().setVisible(true);
      setVisible(false);
    }
    if (a.equals("Fight"))
          {
      new fight().setVisible(true);
      setVisible(false);
    }
   }
}
  