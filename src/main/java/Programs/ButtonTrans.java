package programs;
import java.awt.*;
import java.awt.event.*;
public class ButtonTrans extends Frame implements ActionListener
{
	int x=100,y=100,w=100,h=100;
	String s="Click the button";
	Button b,b1;
	ButtonTrans()
	{
		setSize(800,800);
		setLayout(null);
		b=new Button("Translation");
		b.setBounds(300,600,100,50);
		b.addActionListener(this);
		add(b);

		b1=new Button("Scaling");
		b1.setBounds(500,600,100,50);
		b1.addActionListener(this);
		add(b1);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==b)
		{
			x+=100;
			y+=50;
			s=b.getActionCommand();
		}
		else if (e.getSource()==b1)
		{
			w+=100;
			h+=50;
			s=b1.getActionCommand();
		}

		java.util.Random r=new java.util.Random();
		Color c=new Color(r.nextInt());
		setBackground(c);

		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(x,y,w,h);

		g.setColor(Color.red);
		Font f=new Font("FONT.BOLD",0,50);
		g.setFont(f);
		g.drawString(s,200,100);
	}


	public static void main(String[] args) 
	{
		new ButtonTrans();
	}
}
