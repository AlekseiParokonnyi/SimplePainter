package painterExtra;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class PToolBar extends JToolBar
{
	private static final long serialVersionUID = 1L;
	PFrame frame;

	public PToolBar(PCommand cmd, PFrame frame)
	{
		this.frame = frame;
		setBounds(0, 0, frame.getWidth(), 35);
		setLayout(null);
		
		//Color
		JButton colBlack = new JButton("Black");
		JButton colRed   = new JButton("Red");
		JButton colGreen = new JButton("Green");
		
		colBlack.setForeground(Color.white);
		
		colBlack.setFocusable(false);
		colRed.setFocusable(false);
		colGreen.setFocusable(false);
		
		colBlack.setBounds(15, 5, 65, 25);
		colRed.setBounds(85, 5, 65, 25);
		colGreen.setBounds(155, 5, 65, 25);
		
		colBlack.setBackground(Color.black);
		colRed.setBackground(Color.red);
		colGreen.setBackground(Color.green);
		
		add(colBlack);
		add(colRed);
		add(colGreen);
		
		colBlack.addActionListener(cmd.aColor);
		colRed.addActionListener(cmd.aColor);
		colGreen.addActionListener(cmd.aColor);
		
		addSeparator();
		
		//Width
		JButton width1  = new JButton("Width 1");
		JButton width5  = new JButton("Width 5");
		JButton width10 = new JButton("Width 10");
		
		width1.setBounds(230, 5, 65, 25);
		width5.setBounds(300, 5, 65, 25);
		width10.setBounds(370, 5, 65, 25);
		
		width1.setFocusable(false);
		width5.setFocusable(false);
		width10.setFocusable(false);
		
		add(width1);
		add(width5);
		add(width10);
		
		width1.addActionListener(cmd.aWidth);
		width5.addActionListener(cmd.aWidth);
		width10.addActionListener(cmd.aWidth);
	}
}
