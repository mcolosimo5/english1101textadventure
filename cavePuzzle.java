import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class cavePuzzle extends JFrame implements ActionListener {
  
  private static final long serialVersionUID = 1L;
  public static int number = 0;
  public static int completed = 0;
  
  public static void main (String args [])
  {
    new cavePuzzle().setVisible(true);
  }
  
  public cavePuzzle() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(new Color(175, 31, 31));
    Random rand = new Random();
    int n = rand.nextInt(10);
    number = n;
    
    if (n < 5)
    {
    JLabel content = new JLabel("You arrive at a crossroad, and you see a tuft of dust settling around the left corner.");
    add(content);
    
    JLabel content4 = new JLabel("Which way do you go?");
    add(content4);
    
    content.setForeground(Color.WHITE);
    content4.setForeground(Color.WHITE);
    }
    
    else if (n >= 5)
    {
    JLabel content2 = new JLabel("You hear an echo of footsteps come from around the left corner.");
    add(content2);
   
    JLabel content5 = new JLabel("Which way do you go?");
    add(content5);
    
    content2.setForeground(Color.WHITE);
    content5.setForeground(Color.WHITE);
    }
    
    JButton left = new JButton("Left");
    left.addActionListener(this);
    add(left);
    
    JButton right = new JButton("Right");
    right.addActionListener(this);
    add(right);
    
    
   }
  
   @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (completed == 4)
    {
     completed = 0; 
     new cavePuzzleComplete().setVisible(true);
     setVisible(false);
    }
    else if (a.equals("Left") && number < 5)
          {
      completed = completed + 1;
      new cavePuzzle().setVisible(true);
      setVisible(false);
    }
    else if (a.equals("Right")  && number >= 5)
          {
      completed = completed + 1;
      new cavePuzzle().setVisible(true);
      setVisible(false);
    }
    else 
    {
      completed = 0;
      new chaseDeath().setVisible(true);
      setVisible(false);
      
    }
     
   }
}
  
  
      
 
  
