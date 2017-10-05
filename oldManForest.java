import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class oldManForest extends JFrame {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new oldManForest().setVisible(true);
  }
  
  public oldManForest() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel content = new JLabel("You decide to " + forest.actionTaken + " .");
    add(content);
    
    JLabel content2 = new JLabel("As you are walking around, a man approaches you with his bow aimed at your head.");
    add(content2);
    
    JLabel content3 = new JLabel("He asks you for your name. You tell him.");
    add(content3);
    
    final JTextField nameTextField = new JTextField(20);
    add(nameTextField);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener () {public void actionPerformed (ActionEvent ae){
      String name;

      name = nameTextField.getText();
      if (name.equals(gameScreen.nameGood))
      {
        new oldManForest().setVisible(true);
      }
      else
      {
        new oldManForest2().setVisible(true);
      }
    }
    }
    );
    add(submit);
    
  }
  
 
    }