import java.io.*;
class FileReading 
{
	public static void main(String[] args) 
	{
		reading();
	}

	static void reading()
	{
		File fin=null;
		FileReader fr=null;
		try{
			char c='a';
			int x=0;
			fin = new File("file.txt");
			fr = new FileReader(fin);
			while(x!=-1)
			{
				x=fr.read();
				c=(char)x;
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
