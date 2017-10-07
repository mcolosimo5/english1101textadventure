import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class askBeast extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new askBeast().setVisible(true);
  }
  
  public askBeast() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("You ask the beast why he has led you here.");
    add(content);
    
    JLabel content2 = new JLabel("It responds, 'You have come to the gates of my underworld kingdom. It is too late for you. My work is nearly finished.'");
    add(content2);
    
    JLabel content3 = new JLabel("You have two options. You can kick the rocks at the beast or charge the beast.");
    add(content3);
    
    JLabel content4 = new JLabel("What do you do?");
    add(content4);
    
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    
    JButton kick = new JButton("Kick the Rocks");
    kick.addActionListener(this);
    add(kick);
    
    JButton charge = new JButton("Charge the Beast");
    charge.addActionListener(this);
    add(charge);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Kick the Rocks"))
          {
      new kickRocks().setVisible(true);
      setVisible(false);
    }
    if (a.equals("Charge the Beast"))
          {
      new beastCharge().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
