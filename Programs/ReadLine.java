import java.io.*;
class ReadLine 
{
	public static void main(String[] args) 
	{
		reading();
	}

	static void reading()
	{
		BufferedReader br = null;
		File fin=null;
		FileReader fr=null;
		try{
			fin = new File("file.txt");
			fr = new FileReader(fin);
			br = new BufferedReader(fr);
			String s = "";
			while(s!=null)
			{
				s=br.readLine();
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
