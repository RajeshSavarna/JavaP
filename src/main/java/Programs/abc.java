simport java.awt.*;
class abc extends Frame 
{
	abc()
	{
		setSize(700,900);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillArc(400,320,200,400,45,90);
		g.fillArc(400,320,200,200,195,45);
		g.drawString("My First Graphics Prog.",400,320);
		

	}

	public static void main(String[] args) 
	{
		new abc();
	}
}
