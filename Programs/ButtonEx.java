import java.awt.*;
import java.awt.event.*;
public class ButtonEx extends Frame implements ActionListener
{
	int x=100,y=100,w=100,h=100;
	Button b;
	ButtonEx()
	{
		setSize(800,800);
		setLayout(null);
		b=new Button("Translation");
		b.setBounds(300,600,100,50);
		b.addActionListener(this);
		add(b);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		x+=100;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(x,y,w,h);
	}


	public static void main(String[] args) 
	{
		new ButtonEx();
	}
}
