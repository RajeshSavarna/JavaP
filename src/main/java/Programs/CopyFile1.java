import java.io.*;
class CopyFile1 
{
	public static void main(String[] args) 
	{
		writing();
		System.out.println("\n\n\n\n\t\tDone\n\n\n\n\n");
	}

	static void writing()
	{
		File fin,fout;
		FileWriter fw=null;
		try{
			fin = new File("file.txt"); //copying from this file
			fout = new File("file1.txt"); //writing in this file
			fw = new FileWriter(fout);
			PrintWriter pw = new PrintWriter(fw,true);
			BufferedReader br = new BufferedReader(new FileReader(fin));
			String s = br.readLine();
			while(s!=null)
			{
				pw.println(s);
				s=br.readLine();
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
