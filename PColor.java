package painterExtra;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PColor extends JPanel
{
	private static final long serialVersionUID = 1L;

	public PColor(PCommand cmd)
	{
		setBounds(5, 10, 140, 140);
		setLayout(null);
		setBackground(Color.white);
		
		JButton colBlack = new JButton("Black");
		JButton colRed   = new JButton("Red");
		JButton colGreen = new JButton("Green");
		
		colBlack.setForeground(Color.white);
		
		colBlack.setBounds(5, 15, 130, 30);
		colRed.setBounds(5, 55, 130, 30);
		colGreen.setBounds(5, 95, 130, 30);
		
		colBlack.setBackground(Color.black);
		colRed.setBackground(Color.red);
		colGreen.setBackground(Color.green);
		
		add(colBlack);
		add(colRed);
		add(colGreen);
		
		colBlack.addActionListener(cmd.aColor);
		colRed.addActionListener(cmd.aColor);
		colGreen.addActionListener(cmd.aColor);
	}
}
