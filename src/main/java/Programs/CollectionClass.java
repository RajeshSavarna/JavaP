import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Enumeration;

class CollectionClass 
{
	public static void main(String[] args) 
	{
		// HashMap
		// it stores data collections as key & value pairs.
		// it cannot contains duplicate key
		// if you add a key which already exists then it overwrites the old element
		// if trying to get a value that is not present in map, it returns the value of null
		// null is a special type that represents the absence of value
		HashMap<String, String> id = new HashMap<String, String>();
		id.put("Rajesh","42386");
		id.put("Kanak","423861");
		id.put("Keshav","423862");
		id.put("Abhishek","423863");
		id.put("Prashant","423864");
		id.put("SharmaJi","423865");

		if (id.containsKey("Rajesh"))
		{
			String pass = id.get("Rajesh");
			System.out.println(pass);
		}
		if (id.containsValue("42386"))
		{
			String pass = id.get("Rajesh");
			System.out.println(pass);
		}
		int b = id.size();
		System.out.println(b);
		
		// LinkedList
		// Similar as ArrayList but we can't specify the initial capacity
		// used for large number of insert or delete
		LinkedList<String> a = new LinkedList<String>();
		a.add("Linked");
		a.add("List");
		Iterator<String> it = a.iterator();
		while (it.hasNext())
		{
			String pass = it.next();
			System.out.println(pass);
		}
		
		// ArrayList
		// Similar as LinkedList but we can specify the initial capacity
		// used when need rapid access to the data
		ArrayList<String> al = new ArrayList<String>();
		//--------------or-----------------
		//ArrayList<String> al = new ArrayList<String>(10);
		al.add("Array");
		al.add("Linked");
		al.add("List");
		al.remove("Linked");
		//Iterator<String> it = al.iterator();
		it = al.iterator();
		while (it.hasNext())
		{
			String pass = it.next();
			//boolean x = al.contains(pass);
			//String str = al.get(1);
			System.out.println(pass);
		}
		
		/*// Enumeration
		Enumeration enm=null;
		enm=id.get(null);
		while(enm.hasMoreElements())
		{
			String n=enm.nextElement().toString();
			System.out.println(n);
		}*/
	}
}
