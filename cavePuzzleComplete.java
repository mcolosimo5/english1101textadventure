import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cavePuzzleComplete extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new cavePuzzleComplete().setVisible(true);
  }
  
  public cavePuzzleComplete() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    
    JLabel content = new JLabel("You follow the hellish beast around countless twists and turns through the cavern.");
    add(content);
    
    JLabel content2 = new JLabel("The creature is always two steps ahead of you. You feel the air getting thick, almost as if it is choking you…");
    add(content2);
    
    JLabel content3 = new JLabel("You realize you are lost in the depth of the cave, if you turn back you may never find your way out.");
    add(content3);
    
    JLabel content4 = new JLabel("You’re all on your own down here. You have to stop this thing.");
    add(content4);
    
    JLabel content5 = new JLabel("You come to another corner, and you can see a faint purple glow around the corner.");
    add(content5);
    
    JLabel content6 = new JLabel("You carefully advance and finally come face to face with the beast.");
    add(content6);
    
    JLabel content7 = new JLabel("It is standing in the middle of a small clearing on 2 legs that look like those of a horse, yet its face exudes pure evil.");
    add(content7);
    
    JLabel content8 = new JLabel("There is a swirling portal behind it, casting the heavy purple glow across the walls of the cave.");
    add(content8);
    
    JLabel content9 = new JLabel("There is a swirling portal behind it, casting the heavy purple glow across the walls of the cave.");
    add(content9);
    
    JLabel content10 = new JLabel("You stop for a moment… You have some options:");
    add(content10);
    
    JLabel content11 = new JLabel("There are some jagged, loose rocks that you can kick up to surprise the monster before you attack.");
    add(content11);
    
    JLabel content12 = new JLabel("You can ask the beast why he has led you here.");
    add(content12);
    
    JLabel content13 = new JLabel("You can charge the beast with all of your strength to knock it into the portal.");
    add(content13);
    
    JLabel content14 = new JLabel("What do you do?");
    add(content14);
    
    content.setForeground(Color.WHITE);
    content2.setForeground(Color.WHITE);
    content3.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    content6.setForeground(Color.WHITE);
    content7.setForeground(Color.WHITE);
    content8.setForeground(Color.WHITE);
    content9.setForeground(Color.WHITE);
    content10.setForeground(Color.WHITE);
    content11.setForeground(Color.WHITE);
    content12.setForeground(Color.WHITE);
    content13.setForeground(Color.WHITE);
    content14.setForeground(Color.WHITE);
    
    JButton kick = new JButton("Kick Rocks at the Beast");
    kick.addActionListener(this);
    add(kick);
    
    JButton ask = new JButton("Ask the Beast");
    ask.addActionListener(this);
    add(ask);
    
    JButton charge = new JButton("Charge the Beast");
    charge.addActionListener(this);
    add(charge);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Kick Rocks at the Beast"))
          {
      new kickRocks().setVisible(true);
      setVisible(false);
    }
    if (a.equals("Ask the Beast"))
          {
      new askBeast().setVisible(true);
      setVisible(false);
    }
    if (a.equals("Charge the Beast"))
          {
      new beastCharge().setVisible(true);
      setVisible(false);
    }
   }
}
  
  
      
 
  
