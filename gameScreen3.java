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
    
    if (gameScreen2.sword == true)
    {
    JLabel contentGameScreen = new JLabel("As you wander out of the blacksmith's hut toward the lively tavern to have a well deserved pint,");
    add(contentGameScreen);
    }
    else
    {
    JLabel contentGameScreen = new JLabel("As you wander out of the temple toward the lively tavern to have a well deserved pint,");
    add(contentGameScreen);
    }
    
    JLabel contentGameScreen4 = new JLabel("you hear the old gatekeeper frantically ringing the alarm bell..");
    add(contentGameScreen4);
    
    JLabel contentGameScreen2 = new JLabel("Nimble bandits swarm over the walls and into the town.");
    add(contentGameScreen2);

    JLabel contentGameScreen3 = new JLabel("What do you do?");
    add(contentGameScreen3);
    
    
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
    }
    if (a.equals("Fight"))
          {
      new fight().setVisible(true);
    }
   }
}
  