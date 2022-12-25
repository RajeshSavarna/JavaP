import java.awt.*;
import java.awt.event.*;
public class Transformation extends Frame implements ActionListener
{
	int x=600,y=250,w=175,h=130,ch=0;
	Button b,b1,l,r,u,d,l1,r1,u1,d1,re;
	Transformation()
	{
		setSize(1400,800);
		setLayout(null);
		b=new Button("Translation");
		b.setBounds(300,600,75,30);
		b.addActionListener(this);
		add(b);

		b1=new Button("Scaling");
		b1.setBounds(1000,600,75,30);
		b1.addActionListener(this);
		add(b1);

		re=new Button("Reset");
		re.setBounds(640,650,75,50);
		re.addActionListener(this);
		add(re);

		
			l=new Button("<<<");
			l.setBounds(200,600,50,30);
			l.addActionListener(this);
			
			r=new Button(">>>");
			r.setBounds(425,600,50,30);
			r.addActionListener(this);
			
			u=new Button("^^^");
			u.setBounds(312,545,50,30);
			u.addActionListener(this);
			
			d=new Button("vvv");
			d.setBounds(312,650,50,30);
			d.addActionListener(this);

			l1=new Button("<<<");
			l1.setBounds(900,600,50,30);
			l1.addActionListener(this);
			
			r1=new Button(">>>");
			r1.setBounds(1125,600,50,30);
			r1.addActionListener(this);
			
			u1=new Button("^^^");
			u1.setBounds(1012,545,50,30);
			u1.addActionListener(this);
			
			d1=new Button("vvv");
			d1.setBounds(1012,650,50,30);
			d1.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource()==b)
		{
			add(l);
			add(r);
			add(u);
			add(d);
		}
		else if (e.getSource()==b1)
		{	
			add(d1);
			add(l1);
			add(r1);
			add(u1);	
		}
		else if(e.getSource()==l)
				x-=50;
		else if(e.getSource()==r)
			x+=50;
		else if(e.getSource()==u)
			y-=50;
		else if(e.getSource()==d)
			y+=50;
		
		else if(e.getSource()==l1)
			w-=50;
		else if(e.getSource()==r1)
			w+=50;
		else if(e.getSource()==u1)
			h-=50;
		else if(e.getSource()==d1)
			h+=50;
			
		else
		{ x=600;y=250;w=175;h=130; }

		java.util.Random random=new java.util.Random();
		Color c=new Color(random.nextInt());
		setBackground(c);

		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		Font f=new Font("FONT.BOLD",0,60);
		g.setFont(f);

		if (((x+w)<=1400)&&((y+h)<=800)&&x>=0&&y>=0)
		{
			g.setColor(Color.green);
			g.fillRect(x,y,w,h);
		}
		else
			g.drawString("Error!!! Area Is Going Outside The Window...",80,400);
		g.drawString("Click Button",510,100);
	}


	public static void main(String[] args) 
	{
		new Transformation();
	}
}
