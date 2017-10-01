import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen extends JFrame {
  
  private static final long serialVersionUID = 1L;
  public static String nameGood;
  
  public static void main (String args [])
  {
    new gameScreen().setVisible(true);
  }
  
  public gameScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen = new JLabel("After what seems like an eternity of walking, you arrive at a small, unimpressive town.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("An old man, possibly the gate keeper, approaches you. He wants to know your name. What do you tell him?");
    add(contentGameScreen2);
    
    final JTextField nameTextField = new JTextField(20);
    add(nameTextField);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener () {public void actionPerformed (ActionEvent ae){
      String name;
      boolean containsQ = false;
      name = nameTextField.getText();
      for (int i = 0; i < name.length(); i++)
      {
        if(name.charAt(i) == 'q' || name.charAt(i) == 'Q')
        {
          containsQ = true;
        }
      }
      if (name.length() < 12)
      {
        new nameTooShortScreen().setVisible(true);
      }
      
      else if (containsQ == false)
      {
        new noQ().setVisible(true);
      }
      else if (containsQ == true && name.length() >= 12)
      {
        nameGood = nameTextField.getText();
        new gameScreen2().setVisible(true);
      }
    }
    }
    );
    add(submit);
    
  }
  
 
    }