import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new gameScreen().setVisible(true);
  }
  
  public gameScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    
    JLabel contentGameScreen = new JLabel("After what seems like an eternity of wandering, you arrive at a small, unimpressive town.");
    add(contentGameScreen);
    
    JLabel contentGameScreen2 = new JLabel("An old man, possibly the gate keeper, approaches you. He wants to know your name… What do you tell him?");
    add(contentGameScreen2);
    
    JTextField name1 = new JTextField(20);
    add(name1);
    
    JButton submit = new JButton("Submit");
    submit.addActionListener(this);
    add(submit);
    
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Submit"))
          {
    }
    else if (a.equals("Go to the Right"))
          {
      
    }
}
}