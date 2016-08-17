package painterExtra;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JOptionPane;

public class PCommand
{
	PData data = new PData();
	
	ActionColor aColor = new ActionColor();
	ActionWidth aWidth = new ActionWidth();
	
	class ActionColor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String btnName = e.getActionCommand();
			//JOptionPane.showMessageDialog(null, "Color " + btnName);
			
			if(btnName.equals("Black"))
			{
				data.color = Color.black;
			}
			else if(btnName.equals("Red"))
			{
				data.color = Color.red;
			}
			else if(btnName.equals("Green"))
			{
				data.color = Color.green;
			}
		}		
	}
	
	class ActionWidth implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String btnName = e.getActionCommand();
			//JOptionPane.showMessageDialog(null, "Width " + btnName);
			
			if (btnName.equals("Width 1")) 
			{
				data.width = 1;
			}
			else if (btnName.equals("Width 5"))
			{
				data.width = 5;
			}
			else if (btnName.equals("Width 10"))
			{
				data.width = 10;
			}			
		}		
	}
}
