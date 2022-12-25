package programs;
import java.awt.*;
import java.awt.event.*;

public class ImageEx extends Frame implements ActionListener
{
	int x=101,y=100,w=100,h=100;
	
	Button b;
	Image img;
	Toolkit tk;

	ImageEx()
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


	public static void main(String[] args) 
	{
		new ImageEx();
	}
}
