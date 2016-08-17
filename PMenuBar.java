package painterExtra;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PMenuBar extends JMenuBar
{
	private static final long serialVersionUID = 1L;

	public PMenuBar(PCommand cmd)
	{
		//Color
		JMenu colorMenu = new JMenu("Color");
		
		JMenuItem mnuColBlack = new JMenuItem("Black");
		JMenuItem mnuColRed   = new JMenuItem("Red");
		JMenuItem mnuColGreen = new JMenuItem("Green");
		
		colorMenu.add(mnuColBlack);
		colorMenu.add(mnuColRed);
		colorMenu.add(mnuColGreen);
		
		mnuColBlack.addActionListener(cmd.aColor);
		mnuColRed.addActionListener(cmd.aColor);
		mnuColGreen.addActionListener(cmd.aColor);
		
		add(colorMenu);
		
		//Width
		JMenu widthMenu = new JMenu("Width");
		
		JMenuItem width1  = new JMenuItem("Width 1");
		JMenuItem width5  = new JMenuItem("Width 5");
		JMenuItem width10 = new JMenuItem("Width 10");
		
		widthMenu.add(width1);
		widthMenu.add(width5);
		widthMenu.add(width10);
		
		width1.addActionListener(cmd.aWidth);
		width5.addActionListener(cmd.aWidth);
		width10.addActionListener(cmd.aWidth);
		
		add(widthMenu);
	}
}
