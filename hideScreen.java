import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hideScreen extends JFrame  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new hideScreen().setVisible(true);
  }
  
  public hideScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(16, 67, 16));
    
    
    JLabel contentGameScreen = new JLabel("You Quickly hide under a Quilt and eat some Quail");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("The gatekeeper seems impressed with your commitment to the letter Q.");
    add(contentGameScreen2);
    
    JLabel contentGameScreen3 = new JLabel("He decides to give you one more chance to tell him your name. You tell him...");
    add(contentGameScreen3);
    
    contentGameScreen.setForeground(Color.WHITE);
    contentGameScreen2.setForeground(Color.WHITE);
    contentGameScreen3.setForeground(Color.WHITE);
    
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
        setVisible(false);
      }
      
      else if (containsQ == false)
      {
        new waitScreen().setVisible(true);
        setVisible(false);
      }
      else if (containsQ == true && name.length() >= 12)
      {
        gameScreen.nameGood = name;
        new gameScreen2().setVisible(true);
        setVisible(false);
      }
    }
    }
    );
    add(submit);
    
}
}