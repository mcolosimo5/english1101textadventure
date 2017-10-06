import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class forest extends JFrame {
  
  private static final long serialVersionUID = 1L;
  public static String actionTaken = "";
  
  public static void main (String args [])
  {
    new forest().setVisible(true);
  }
  
  public forest() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    
    JLabel contentGameScreen = new JLabel("You arrive at the forest. What is your next action?");
    add(contentGameScreen);
    
    contentGameScreen.setForeground(Color.WHITE);
    
    final JTextField nameTextField = new JTextField(40);
    add(nameTextField);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(new ActionListener () {public void actionPerformed (ActionEvent ae){
      String name;
      boolean containsTerm = false;
      name = (nameTextField.getText()).toLowerCase();
      for (int i = 0; i < name.length() - 5; i++)
      {
        if((name.substring(i,i + 6)).equals("search"))
        {
          containsTerm = true;
        }
      }
      for (int i = 0; i < name.length() - 3; i++)
      {
        if((name.substring(i,i + 4)).equals("look"))
        {
          containsTerm = true;
        }
      }
      for (int i = 0; i < name.length() - 3; i++)
      {
        if((name.substring(i,i + 4)).equals("find"))
        {
          containsTerm = true;
        }
      }
       for (int i = 0; i < name.length() - 6; i++)
      {
        if((name.substring(i,i + 7)).equals("explore"))
        {
          containsTerm = true;
        }
      }
      if (containsTerm == true)
      {
        actionTaken = name;
        new oldManForest().setVisible(true);
        setVisible(false);
      }
      
      else
      {
        actionTaken = name;
        new forestDeath().setVisible(true);
        setVisible(false);
      }
    
    }
    }
    );
    add(submit);
    
  }
  
 
    }