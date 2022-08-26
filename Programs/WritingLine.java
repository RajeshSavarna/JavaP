import java.io.*;
class WritingLine 
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
		String s = "";
		BufferedReader br = null;
		PrintWriter pw = null;
		try{
			fout = new File("file.txt");
			fw = new FileWriter(fout);
			pw = new PrintWriter(fw,true);
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter  new line to write in file");
			while(i<=10)
			{
				s=br.readLine();
				pw.println(s);
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
