package programs;
import java.io.*;
class Writing 
{
	public static void main(String[] args) 
	{
		writing();
	}

	static void writing()
	{
		File fout=null;
		FileWriter fw=null;
		int i=0;
		char ch = 'a';
		BufferedReader br = null;
		try{
			fout = new File("file.txt");
			fw = new FileWriter(fout);
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a new character to write in file");
			while(i<=10)
			{
				ch=(char)br.read();
				fw.write(ch);
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
