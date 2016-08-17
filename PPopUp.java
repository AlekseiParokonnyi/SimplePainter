package painterExtra;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PPopUp extends JPopupMenu
{
	private static final long serialVersionUID = 1L;

	public PPopUp(PCommand cmd)
	{
		//Color
		JMenuItem mnuColBlack = new JMenuItem("Black");
		JMenuItem mnuColRed   = new JMenuItem("Red");
		JMenuItem mnuColGreen = new JMenuItem("Green");
		
		add(mnuColBlack);
		add(mnuColRed);
		add(mnuColGreen);
		
		mnuColBlack.addActionListener(cmd.aColor);
		mnuColRed.addActionListener(cmd.aColor);
		mnuColGreen.addActionListener(cmd.aColor);
		
		addSeparator();
		
		//Width
		JMenuItem width1  = new JMenuItem("Width 1");
		JMenuItem width5  = new JMenuItem("Width 5");
		JMenuItem width10 = new JMenuItem("Width 10");
		
		add(width1);
		add(width5);
		add(width10);
		
		width1.addActionListener(cmd.aWidth);
		width5.addActionListener(cmd.aWidth);
		width10.addActionListener(cmd.aWidth);
	}
}
