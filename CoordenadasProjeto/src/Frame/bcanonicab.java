package Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class bcanonicab extends JFrame  implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8, l9,l10,l11,l12;
	JTextField tx1,tx2,tx3,tx4,tx5,tx6, tx7,tx8,tx9,tx10;
	JButton sair,calcular;
	
	public bcanonicab()
	{
		setTitle("CANÔNICA -> B1");
		setSize(550,600);
		setLocation(120,120);
		setLayout(null);
		setResizable(true);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		// LABEL TITULO
		l7 = new JLabel("CALCULO DE COORDENADAS EM R2!");
		l7.setSize(220,20);
		l7.setLocation(130,30);
		l7.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l7);
				
		// LABEL X1
		l1 = new JLabel("Digite o primeiro X da nova coordenada:");
		l1.setSize(185,20);
		l1.setLocation(20,75);
		l1.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l1);
		
		// LABEL X2
		l2 = new JLabel("Digite o segundo X da nova coordenada:");
		l2.setSize(185,20);
		l2.setLocation(20,120);
		l2.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l2);
		
		// LABEL Y1
		l3 = new JLabel("Digite o primeiro Y da nova coordenada:");
		l3.setSize(185,20);
		l3.setLocation(20,160);
		l3.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l3);
		
		// LABEL Y2
		l4 = new JLabel("Digite o segundo Y da nova coordenada:");
		l4.setSize(185,20);
		l4.setLocation(20,200);
		l4.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l4);
		
		// LABEL ALPHA
		l5 = new JLabel("Digite o alpha:");
		l5.setSize(185,20);
		l5.setLocation(20,235);
		l5.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l5);
		
		// LABEL BETA
		l6 = new JLabel("Digite o beta:");
		l6.setSize(185,20);
		l6.setLocation(20,270);
		l6.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l6);
		
		//LABEL X1(B2)
		l9 = new JLabel("Digite o primeiro X da nova coo(B2):");
		l9.setSize(210,20);
		l9.setLocation(20,305);
		l9.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l9);
		
		//LABEL X2(B2)
		l10 = new JLabel("Digite o segundo X da nova coo(B2):");
		l10.setSize(210,20);
		l10.setLocation(20,345);
		l10.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l10);
		
		//LABEL Y1(B2)
		l11 = new JLabel("Digite o primeiro Y da nova coo(B2):");
		l11.setSize(210,20);
		l11.setLocation(20,385);
		l11.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l11);
		
		//LABEL Y2(B2)
		l12 = new JLabel("Digite o segundo Y da nova coo(B2):");
		l12.setSize(210,20);
		l12.setLocation(20,425);
		l12.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l12);
				
		// LABEL RESULTADO
		l8 = new JLabel("RESULTADO:");
		l8.setSize(450,20);
		l8.setLocation(20,455);
		l8.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(l8);
		
		
		
		
		//TEXT FIELD 1
		tx1 = new JTextField("");
		tx1.setSize(250,30);
		tx1.setLocation(220,70);
		getContentPane().add(tx1);
		
		//TEXT FIELD 2
		tx2 = new JTextField("");
		tx2.setSize(250,30);
		tx2.setLocation(220,115);
		getContentPane().add(tx2);
		
		//TEXT FIELD 3
		tx3 = new JTextField("");
		tx3.setSize(250,30);
		tx3.setLocation(220,155);
		getContentPane().add(tx3);
		
		//TEXT FIELD 4
		tx4 = new JTextField("");
		tx4.setSize(250,30);
		tx4.setLocation(220,195);
		getContentPane().add(tx4);
		
		//TEXT FIELD 5
		tx5 = new JTextField("");
		tx5.setSize(250,30);
		tx5.setLocation(110,230);
		getContentPane().add(tx5);
		
		//TEXT FIELD 6
		tx6 = new JTextField("");
		tx6.setSize(250,30);
		tx6.setLocation(110,265);
		getContentPane().add(tx6);
		
		//TEXT FIELD 7
		tx7 = new JTextField("");
		tx7.setSize(250,30);
		tx7.setLocation(230,305);
		getContentPane().add(tx7);
		
		//TEXT FIELD 8
		tx8 = new JTextField("");
		tx8.setSize(250,30);
		tx8.setLocation(230,345);
		getContentPane().add(tx8);
		
		//TEXT FIELD 9
		tx9 = new JTextField("");
		tx9.setSize(250,30);
		tx9.setLocation(230,385);
		getContentPane().add(tx9);
		
		//TEXT FIELD 10
		tx10 = new JTextField("");
		tx10.setSize(250,30);
		tx10.setLocation(230,425);
		getContentPane().add(tx10);
		
		
		
		
		// BOTÃO CALCULAR
		calcular = new JButton("CALCULAR");
		calcular.setSize(100,50);
		calcular.setLocation(20,490);
		calcular.setBackground(new Color(65,105,225));
		calcular.addActionListener(this);
		getContentPane().add(calcular);
				
		//BOTÃO SAIR
		sair = new JButton("SAIR");
		sair.setSize(100,50);
		sair.setLocation(350,490);
		sair.setBackground(new Color(65,105,225));
		sair.addActionListener(this);
		getContentPane().add(sair);
		
		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource() == sair)
		{
			dispose();
		}
		else if (e.getSource() == calcular)
		{
			double d,dX,dY,resultadoA,resultadoB,x,y,c1,c2;
			
            //B1 -> CANONICA 
			c1 = (Double.parseDouble(tx5.getText()) * Double.parseDouble(tx1.getText())) + (Double.parseDouble(tx6.getText()) * Double.parseDouble(tx3.getText()));
			c2 = (Double.parseDouble(tx5.getText()) * Double.parseDouble(tx2.getText())) + (Double.parseDouble(tx6.getText()) * Double.parseDouble(tx4.getText()));
			
			//CANONICA -> B2
			x = c1;
			y = c2;
			
			d = (Double.parseDouble(tx7.getText()) * Double.parseDouble(tx10.getText())) + ((Double.parseDouble(tx8.getText()) * Double.parseDouble(tx9.getText()))*-1);
			dX = (y * Double.parseDouble(tx9.getText())) + ((Double.parseDouble(tx10.getText()) * x)*-1);
			dY = (Double.parseDouble(tx7.getText()) * y) + ((Double.parseDouble(tx8.getText()) * x)*-1);
			
			resultadoA = d/dX;
			resultadoB = d/dY;
			
			l8.setText("As novas coordenadas são ("+ resultadoA + "," + resultadoB + ")");
		}
	}
	
	public static void main (String args[])
	{
		new bcanonicab();
		
	}

}
