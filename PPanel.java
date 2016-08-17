package painterExtra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	
	int x;
	int y;
	
	PData data = null;
	
	public PPanel(PCommand cmd)
	{
		this.data = cmd.data;
		setBounds(165, 40, 800, 480);
		setBackground(Color.white);
		setComponentPopupMenu(new PPopUp(cmd));
		addMouseListener(this);
		addMouseMotionListener(this);
	}	

	@Override
	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
	}
	
	@Override
	public void mouseDragged(MouseEvent e)
	{
		Graphics2D gg = (Graphics2D) this.getGraphics();
		gg.setColor( data.color );
		gg.setStroke(new BasicStroke( data.width ));
		gg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
