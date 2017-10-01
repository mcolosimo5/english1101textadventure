import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class temple extends JFrame {
  
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
    
    JLabel content = new JLabel("You enter the temple. The priest offers you a glowing stick and says 'It has magical abilities, use it well.'");
    add(content);
    
    JLabel content1 = new JLabel("Before giving it to you, he asks you for your name. You tell him...");
    add(content1);
    
    final JTextField nameTextField = new JTextField(20);
    add(nameTextField);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener () {public void actionPerformed (ActionEvent ae){
      String name;
      boolean containsQ = false;
      name = nameTextField.getText();
      if (name.equals(gameScreen.nameGood))
      {
        gameScreen2.sword = false;
        blacksmith.bow = false;
        new gameScreen3().setVisible(true);
      }
      else
      {
        gameScreen2.sword = false;
        blacksmith.bow = false;
        new wrongName().setVisible(true); 
      } 
    
    }
    
    }
                             );
    add(submit);
                             }
}
                             
   
                             
                             
  
  
  
      
 
  