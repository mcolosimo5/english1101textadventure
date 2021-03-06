import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class levelScreen extends JFrame implements ActionListener  {
  
  private static final long serialVersionUID = 1L;
  
  public static void main (String args [])
  {
    new levelScreen().setVisible(true);
  }
  
  public levelScreen() {
    super("Play Game");
    setSize(800, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    getContentPane().setBackground(Color.DARK_GRAY);
    
    JButton level1 = new JButton ("Level 1");
    level1.addActionListener(this);
    
    JButton level2 = new JButton ("Level 2");
    level2.addActionListener(this);
    
    JButton level3 = new JButton ("Level 3");
    level3.addActionListener(this);
    
    JButton instructions = new JButton ("Instructions");
    instructions.addActionListener(this);
    
    JButton exit = new JButton ("Exit");
    exit.addActionListener(this);
    
    add(level1);
    add(level2);
    add(level3);
    add(instructions);
    add(exit);
    
  }
  
  @Override 
  public void actionPerformed (ActionEvent e) {
    String a = e.getActionCommand();
    
    if (a.equals("Level 1"))
          {
      new backstory().setVisible(true);
      setVisible(false);
    }
    else if (a.equals("Level 2"))
          {
      new backstory2().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("Level 3") )
              {
      new gameScreen5().setVisible(true);
      setVisible(false);
    }
    else if(a.equals("Exit") )
              {
                System.exit(0);
    }
    else if(a.equals("Instructions") )
              {
                new instructions().setVisible(true);
                setVisible(false);
    }
  }
}