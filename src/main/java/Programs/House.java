import java.awt.*;
class House extends Frame 
{
	House()
	{
		setSize(700,900);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawRect(150,300,450,200);
		g.drawLine(140,300,610,300);
		g.drawLine(300,300,300,500);
		g.drawRect(400,350,150,100);
		g.drawArc(375,320,200,200,45,90);
		g.drawArc(400,329,150,150,45,90);
		g.drawArc(425,336,100,100,45,90);
		g.drawLine(450,350,450,450);
		g.drawLine(500,350,500,450);
		g.drawLine(400,375,550,375);
		g.drawLine(400,400,550,400);
		g.drawLine(400,425,550,425);
		g.drawLine(140,300,240,200);
		g.drawLine(300,300,240,200);
		g.drawLine(240,200,530,200);
		g.drawLine(260,233,555,233);
		g.drawLine(280,266,583,266);
		g.drawLine(530,200,610,300);
		g.drawOval(210,250,30,25);
		g.drawRect(200,350,50,150);
		g.drawLine(218,380,215,500);
		g.drawLine(232,380,235,500);
		g.drawLine(200,350,218,380);
		g.drawLine(250,350,232,380);
	}

	public static void main(String[] args) 
	{
		new House();
	}
}
