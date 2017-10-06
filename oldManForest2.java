import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class oldManForest2 extends JFrame  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new oldManForest2().setVisible(true);
  }
  
  public oldManForest2() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel("The man Questions your name.");
    add(content);
    
    JLabel content2 = new JLabel("He gives you one more chance to provide him a less Questionable name.");
    add(content2);
    
    JLabel content3 = new JLabel("He tells you to at least provide him a believiable name.");
    add(content3);
    
    JLabel content4 = new JLabel("You tell him...");
    add(content4);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    
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
        new oldManForestDeath().setVisible(true);
        setVisible(false);
      }
      
      else if (containsQ == false)
      {
        new oldManForestDeath().setVisible(true);
        setVisible(false);
      }
      else if (containsQ == true && name.length() >= 12)
      {
        new investigation().setVisible(true);
        setVisible(false);
      }
    }
    }
    );
    add(submit);
    
}
}