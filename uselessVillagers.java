import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class uselessVillagers extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new uselessVillagers().setVisible(true);
  }
  
  public uselessVillagers() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("Wait for those useless villagers to arrive as your backup? You keep waiting and waiting.");
    add(content);
    
    JLabel content2 = new JLabel("They never show up, and you get tired and fall asleep at the mouth of the cave.");
    add(content2);
    
    JLabel content3 = new JLabel("While you rest, the werewolf emerges and sinks his fangs into your neck. You die.");
    add(content3);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    
    JButton cont = new JButton("Continue");
    cont.addActionListener(this);
    add(cont);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Continue"))
          {
      new deathScreen3().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
