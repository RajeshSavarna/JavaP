package programs;
import java.awt.*;
import java.awt.event.*;
public class MouseExample11 extends Frame implements MouseListener
{
	int x=100,y=200,w=100,h=200;
	MouseExample11()
	{
		setSize(1000,600);
		setVisible(true);
		addMouseListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX()+100;
		y=e.getY()+100;
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		x=e.getX()-100;
		y=e.getY()-100;
		repaint();
	}	
	public void mouseEntered(MouseEvent e)
	{
		x=e.getX()-50;
		y=e.getY()-50;
		repaint();
	}	
	public void mouseExited(MouseEvent e)
	{
		x=e.getX()+200;
		y=e.getY()+200;
		repaint();
	}
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
		new MouseExample11();
	}
}
