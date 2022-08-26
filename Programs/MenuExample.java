import java.awt.*;
import java.awt.event.*;
public class MenuExample extends Frame implements ActionListener
{
	int x=100,y=100,w=100,h=100;
	Menu m;
	MenuItem mi,mj;
	MenuBar mb;
	MenuExample()
	{
		setSize(800,800);
		setLayout(null);
		m=new Menu("File");
		mi=new MenuItem("Forward");
		mj=new MenuItem("Backward");
		m.add(mi);
		m.add(mj);
		mb=new MenuBar();
		mb.add(m);
		setMenuBar(mb);
		m.addActionListener(this);
		//mi.addActionListener(this);
		//mj.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==mi)
		{
			x+=100;
			repaint();
		}
		else if (e.getSource()==mj)
		{
			x-=100;
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(x,y,w,h);
	}


	public static void main(String[] args) 
	{
		new MenuExample();
	}
}
