import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class investigation extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new investigation().setVisible(true);
  }
  
  public investigation() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    JLabel content = new JLabel("The man lets you live.");
    add(content);
    
    JLabel content2 = new JLabel("You tell him about your adventure, and he tells you about strange events that have been hapening near the forest's edge.");
    add(content2);
    
    JLabel content3 = new JLabel("You continue on your journey to find the killer.");
    add(content3);
    
    JLabel content4 = new JLabel("As you approach the edge of the forest, you stumble on three potential clues.");
    add(content4);
    
    JLabel content5 = new JLabel("In front of you, you see a blood covered branch.");
    add(content5);
      
    JLabel content6 = new JLabel("To your right, you see animal footprints, and to your left, you see a tattered article of clothing.");
    add(content6);
    
    JLabel content7 = new JLabel("Which clue do you follow?");
    add(content7);
    
    JButton blood = new JButton("The Blood");
    blood.addActionListener(this);
    add(blood);
      
    JButton footprints = new JButton("The Footprints");
    footprints.addActionListener(this);
    add(footprints);
    
    JButton clothes = new JButton("The Clothing");
    clothes.addActionListener(this);
    add(clothes);
    
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
  
  
      
 
  
