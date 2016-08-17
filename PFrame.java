package painterExtra;

import javax.swing.JFrame;

public class PFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public PFrame()
	{
		setTitle("Draw");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setLayout(null);
		
		PCommand cmd = new PCommand();
		
		PPanel workPanel = new PPanel(cmd);
		PMenuBar menuBar = new PMenuBar(cmd);
		PToolBar toolBar = new PToolBar(cmd, this);
		PToolBox toolBox = new PToolBox(cmd);
		
		add(workPanel);
		setJMenuBar(menuBar);
		add(toolBar);
		add(toolBox);
		
		setVisible(true);
	}
}
