import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chase extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new chase().setVisible(true);
  }
  
  public chase() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    
    JLabel content = new JLabel("You chase after the werewolf, but the werewolf is much faster. You can no longer see it anymore.");
    add(content);
    
    JLabel content2 = new JLabel("You can go thowards the river, into an open field of tall grass, or towards the cave.");
    add(content2);
    
    JLabel content3 = new JLabel("Where do you go?");
    add(content3);
    
    JButton river = new JButton("The River");
    river.addActionListener(this);
    add(river);
      
    JButton field = new JButton("The Field");
    field.addActionListener(this);
    add(field);
    
    JButton cave = new JButton("The Cave");
    cave.addActionListener(this);
    add(cave);
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("The Blood"))
          {
      new blood().setVisible(true);
    }
    else if(a.equals("The Footprints"))
      {
      new whereTo().setVisible(true);
    }
    else if(a.equals("The Clothing"))
      {
      new clothing().setVisible(true);
    }
   }
}
  
  
      
 
  
