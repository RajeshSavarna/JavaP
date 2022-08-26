import java.awt.*;
import java.awt.event.*;
public class MouseExample extends Frame implements MouseListener
{
	int x=100,y=200,w=100,h=200;
	MouseExample()
	{
		setSize(1000,800);
		setVisible(true);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}	
	public void mouseEntered(MouseEvent e){}	
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawOval(x,y,w,h);
	}

	public static void main(String[] args) 
	{
		new MouseExample();
	}
}
