package painterExtra;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PWidth extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public PWidth(PCommand cmd)
	{
		setBounds(5, 160, 140, 140);
		setLayout(null);
		setBackground(Color.white);
		
		JButton width1  = new JButton("Width 1");
		JButton width5  = new JButton("Width 5");
		JButton width10 = new JButton("Width 10");
		
		width1.setBounds(5, 15, 130, 30);
		width5.setBounds(5, 55, 130, 30);
		width10.setBounds(5, 95, 130, 30);
		
		add(width1);
		add(width5);
		add(width10);
		
		width1.addActionListener(cmd.aWidth);
		width5.addActionListener(cmd.aWidth);
		width10.addActionListener(cmd.aWidth);
	}
}
