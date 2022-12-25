package programs;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code=AppletEx width=600 height=600></applet>

public class AppletEx extends Applet implements ActionListener
{
	int x=101,y=100,w=100,h=100;
	
	Button b;
	Image img;
	Toolkit tk;

	public void init()
	{
		setSize(800,800);
		setLayout(null);
		b=new Button("Translation");
		tk=Toolkit.getDefaultToolkit();
		img=tk.getImage("Parrot.jpg");
		
		b.setBounds(300,600,100,50);
		b.addActionListener(this);
		add(b);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		x+=1;
		repaint();
	}
	public void paint(Graphics g)
	{
		if(x%2==0)
		g.drawImage(img,10,10,this);
	}


}
