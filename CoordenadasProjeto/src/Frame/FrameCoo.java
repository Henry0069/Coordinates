package Frame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FrameCoo extends JFrame implements ActionListener
{
	JButton B1,B2,B3;
	
   public FrameCoo()
   {
	   setTitle("Calculadora de Renderização");
	   setResizable(false);
	   setSize(500,400);
	   setLocation(150,150);
	   setLayout(null);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   B1 = new JButton("B1 -> Canônica");
	   B1.setBackground(new Color(65,105,225));
	   B1.setSize(150,50);
	   B1.setLocation(175,90);
	   B1.addActionListener(this);
	   add(B1);
	   
	   B2 = new JButton("Canônica -> B1");
	   B2.setBackground(new Color(65,105,225));
	   B2.setSize(150,50);
	   B2.setLocation(175,150);
	   B2.addActionListener(this);
	   add(B2); 
	   
	   B3 = new JButton("B1 -> Canônica -> B2");
	   B3.setBackground(new Color(65,105,225));
	   B3.setSize(150,50);
	   B3.setLocation(175,210);
	   B3.addActionListener(this);
	   add(B3); 
	   
	   setVisible(true);
   }
   
   public void actionPerformed (ActionEvent e)
	{
		if(e.getSource() == B1)
		{
			new b1canonica();
		}
		else if(e.getSource() == B2)
		{
			new canonicab1();
		}
		else 
		{
			new bcanonicab();
		}
	}
   
    public static void main (String args[])
   {
	   new FrameCoo();
	   
   }
}
