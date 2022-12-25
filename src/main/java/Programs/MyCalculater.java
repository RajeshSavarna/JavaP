import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculater extends JFrame implements ActionListener
{
	public static void main(String[] args) // main method
	{
		new Calculater();
	}

	String s;
	int res=0;
	MenuBar mb;
	Menu view,edit,help;
	MenuItem Standard,Scientific,Converter,Exit;
	JButton e1,e2,e3,e4,e5,e6,e7,e8,e9,e0,e00,dot,plus,min,mul,div,enter,clear;
	Font f;
	Color col;
	JTextArea ta;

	Calculater()	//constructor 
	{
		super("Calculater");
		setSize(505,545);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mb=new MenuBar();
		setMenuBar(mb);
		setBackground(col);		
		//.........Initializing Menu.............
		view=new Menu("View");
		edit=new Menu("Edit");
		help=new Menu("Help");
		//...........Initializing MenuItem..........
		Standard=new MenuItem("Standard");
		Scientific=new MenuItem("Scientific");
		Converter=new MenuItem("Converter");
		Exit=new MenuItem("Exit");
		//..........Initializing Button........
		f=new Font("FONT.BOLD",55,30);
		col=new Color(91,121,101);
		ta=new JTextArea();
		e1=new JButton("1");
		e2=new JButton("2");
		e3=new JButton("3");
		e4=new JButton("4");
		e5=new JButton("5");
		e6=new JButton("6");
		e7=new JButton("7");
		e8=new JButton("8");
		e9=new JButton("9");
		e0=new JButton("0");
		e00=new JButton("00");
		dot=new JButton(".");
		plus=new JButton("+");
		min=new JButton("-");
		mul=new JButton("*");
		div=new JButton("/");
		enter=new JButton("=");
		clear=new JButton("C");

		ta.setBounds(10,72,485,80);
		ta.setBackground(col);
		ta.setFont(f);

		e1.setBounds(30,200,75,50);
		e2.setBounds(110,200,75,50);
		e3.setBounds(190,200,75,50);
		e4.setBounds(30,255,75,50);
		e5.setBounds(110,255,75,50);
		e6.setBounds(190,255,75,50);
		e7.setBounds(30,310,75,50);
		e8.setBounds(110,310,75,50);
		e9.setBounds(190,310,75,50);
		e0.setBounds(30,365,75,50);
		e00.setBounds(110,365,75,50);
		dot.setBounds(190,365,75,50);
		plus.setBounds(320,310,75,105);
		min.setBounds(320,255,75,50);
		mul.setBounds(320,200,75,50);
		div.setBounds(400,255,75,50);
		enter.setBounds(400,310,75,105);
		clear.setBounds(400,200,75,50);
		//............Menu...................
		view.addActionListener(this);
		edit.addActionListener(this);
		help.addActionListener(this);
		//..........MenuItem............
		Standard.addActionListener(this);
		Scientific.addActionListener(this);
		Converter.addActionListener(this);
		Exit.addActionListener(this);
		//..........Buttons...................
		e1.addActionListener(this);
		e2.addActionListener(this);
		e3.addActionListener(this);
		e4.addActionListener(this);
		e5.addActionListener(this);
		e6.addActionListener(this);
		e7.addActionListener(this);
		e8.addActionListener(this);
		e8.addActionListener(this);
		e9.addActionListener(this);
		e0.addActionListener(this);
		e00.addActionListener(this);
		dot.addActionListener(this);
		plus.addActionListener(this);
		min.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		enter.addActionListener(this);
		clear.addActionListener(this);

		//......Adding Menu To the Menu Bar...........
		mb.add(view);
		mb.add(edit);
		mb.add(help);
		//......Adding Menu Item To the view Menu..........
		view.add(Standard);
		view.add(Scientific);
		view.add(Converter);
		view.add(Exit);
		
		add(ta);
		setVisible(true);
		standard();
	}

	public void actionPerformed(ActionEvent e)	// overridding actionperformed method
	{
		if (e.getSource()==Standard)
			standard();
		else if (e.getSource()==Scientific)
		{
			exit();
			scientific();
		}
		else if (e.getSource()==Converter)
			converter();
		else if (e.getSource()==Exit)
			exit();
		else if (e.getSource()==e1)
				ta.append(e1.getActionCommand());
		else if (e.getSource()==e2)
				ta.append(e2.getActionCommand());
		else if (e.getSource()==e3)
				ta.append(e3.getActionCommand());
		else if (e.getSource()==e4)
				ta.append(e4.getActionCommand());
		else if (e.getSource()==e5)
				ta.append(e5.getActionCommand());
		else if (e.getSource()==e6)
				ta.append(e6.getActionCommand());
		else if (e.getSource()==e7)
				ta.append(e7.getActionCommand());
		else if (e.getSource()==e8)
				ta.append(e8.getActionCommand());
		else if (e.getSource()==e9)
				ta.append(e9.getActionCommand());
		else if (e.getSource()==e0)
				ta.append(e0.getActionCommand());
		else if (e.getSource()==e00)
				ta.append(e00.getActionCommand());
		else if (e.getSource()==dot)
				ta.append(dot.getActionCommand());
		else if (e.getSource()==plus)
		{
				s=ta.getText();
				res+=Integer.parseInt(s);
				ta.append(plus.getActionCommand());
		}
		else if (e.getSource()==min)
				ta.append(min.getActionCommand());
		else if (e.getSource()==mul)
				ta.append(mul.getActionCommand());
		else if (e.getSource()==div)
				ta.append(div.getActionCommand());
		else if (e.getSource()==enter)
		{
				s=ta.getText();	
				res+=Integer.parseInt(s);
				ta.append(enter.getActionCommand()+res);
		}
		else if (e.getSource()==clear)
				ta.setText("");
	}

	void standard()
	{
		add(e1);
		add(e2);
		add(e3);
		add(e4);
		add(e5);
		add(e6);
		add(e7);
		add(e8);
		add(e9);
		add(e0);
		add(e00);
		add(dot);
		add(plus);
		add(min);
		add(mul);
		add(div);
		add(enter);
		add(clear);
	}
	void scientific()
	{
		
	}
	void converter()
	{
	}
	void exit()
	{
		dispose();
	}
}
