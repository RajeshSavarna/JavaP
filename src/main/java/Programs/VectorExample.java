package programs;
import java.util.*;
class  VectorExample
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.addElement(new Integer(5));
		v.addElement(new String("Hello"));
		v.addElement(new Float(75.5));
		Enumeration enu=v.elements();
		while (enu.hasMoreElements())
		{
			String s=enu.nextElement().toString();
			System.out.println("Value="+s);
		}
	}
}
