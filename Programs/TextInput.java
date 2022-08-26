import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TextInput extends Frame implements ActionListener
{
	TextArea ta;
	Button b;
	TextInput()
	{
		setSize(600,600);
		setBackground(Color.blue);
		ta=new TextArea();
		b=new Button("Click");
		
		setLayout(null);
		ta.setBounds(10,30,200,75);
		b.setBounds(300,400,75,35);
		add(ta);
		add(b);
		b.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{

		Random r=new Random();
		Color c=new Color(r.nextInt());

		setBackground(c);
		ta.setText("");
	}
	public static void main(String arg[])
	{
		new TextInput();
	}
}