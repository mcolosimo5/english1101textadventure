import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameScreen4 extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  public static String weapon = "";
  
  public static void main (String args [])
  {
    new gameScreen4().setVisible(true);
  }
  
  public gameScreen4() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(116, 139, 178));
    
    JLabel content = new JLabel("You must prepare to search for the killer. You go to the armory to get a weapon.");
    add(content);
    
    content.setForeground(Color.WHITE);
    
    JButton sword = new JButton("A Silver Sword");
    sword.addActionListener(this);
    add(sword);
      
    JButton axe = new JButton("A Bronze Axe");
    axe.addActionListener(this);
    add(axe);
    
    JButton torch = new JButton("A Torch");
    torch.addActionListener(this);
    add(torch);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("A Silver Sword"))
          {
      weapon = "sword";
      new whereTo().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("A Bronze Axe"))
      {
      weapon = "axe";
      new whereTo().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("A Torch"))
      {
      weapon = "torch";
      new whereTo().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
