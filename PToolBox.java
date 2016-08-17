package painterExtra;

import java.awt.Color;

import javax.swing.JPanel;

public class PToolBox extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	public PToolBox(PCommand cmd)
	{
		setBounds(7, 40, 150, 310);
		setLayout(null);
		setBackground(Color.gray);
		
		PColor pnlCol = new PColor(cmd);
		add(pnlCol);
		
		PWidth pnlWidth = new PWidth(cmd);
		add(pnlWidth);		
	}
}
