import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class blacksmith2 extends JFrame {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new blacksmith2().setVisible(true);
  }
  
  public blacksmith2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    if (blacksmith.bow == true)
    {
    JLabel content = new JLabel("Before handing you your bow, the blacksmith tells you that you must must share the food that you hunt in the woods ");
    add(content);
    
    JLabel content2 = new JLabel("with the villagers. He pulls out a comntract for you to sign...");
    add(content2);
    }
    else{
    JLabel content1 = new JLabel("Before giving you your sword, he tells you that it is paramount that you use the sword for good.");
    add(content1);
    
    JLabel content3 = new JLabel("He pulls out a contract for you to sign.");
    add(content3);
    }
    final JTextField nameTextField = new JTextField(20);
    add(nameTextField);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener () {public void actionPerformed (ActionEvent ae){
      String name;
      boolean containsQ = false;
      name = nameTextField.getText();
      if (name.equals(gameScreen.nameGood))
      {
        new gameScreen3().setVisible(true);
      }
      else
      {
        new wrongName().setVisible(true); 
      } 
    
    }
    }
                             );
    add(submit);
                             }
}
                             
   
                             
                             
  
  
  
      
 
  
