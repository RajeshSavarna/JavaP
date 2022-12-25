package programs;
import java.awt.*;
class GraphicsFirstProg extends Frame 
{
	GraphicsFirstProg()
	{
		setSize(700,700);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawLine(10,20,200,50);
		g.setColor(Color.red);
		g.drawRect(200,200,100,150);
		g.drawString("My First Graphics Prog.",200,200);
		g.fillRect(500,100,100,100);
		g.drawOval(500,500,50,100);
		g.fillOval(200,500,100,50);
		g.drawArc(550,400,100,180,90,45);
	}

	public static void main(String[] args) 
	{
		new GraphicsFirstProg();
	}
}
