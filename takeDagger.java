import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class takeDagger extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new takeDagger().setVisible(true);
  }
  
  public takeDagger() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("You grip the dagger and drive it into the midsection of the beast. He grabs you and jumps into the portal.");
    add(content);
    
    JLabel content2 = new JLabel("Inside, the air is like thick, black smoke choking you… You feel the demon struggling.");
    add(content2);
    
    JLabel content3 = new JLabel("You twist the rock deeper. The beast lets out a fading whimper and dissolves into the smoke.");
    add(content3);
    
    JLabel content4 = new JLabel("You return to the realm of the living and everything is still. You have defeated the beast!");
    add(content4);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new finale().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
