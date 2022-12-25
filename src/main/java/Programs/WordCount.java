package programs;
import java.io.*;
class WordCount
{
	public static void main(String[] args) 
	{
		count();
	}

	static void count()
	{
		String word[]=new String[100];
		int count[]=new int[100],x=0,y=0;
		try{
				File fin = new File("file.txt"); //reading from this file
				FileReader fr = new FileReader(fin);
				BufferedReader br = new BufferedReader(fr);
				String s = br.readLine();
				while(s!=null)
				{
					String split[] = s.split(" ");
					for (int i=0;i<split.length ;i++ )
					{
						x=0;
						y=0;
						for (int j=0;word[j]!=null ;j++ )
						{
							if (word[j].equals(split[i]))
							{
								count[j]++;
								x++;
							}
							y++;
						}
						if (x==0)
						{
							word[y]=split[i];
							count[y]=1;
							
						}
					}
					s = br.readLine();
				}
				for (int i=0;i<100 ;i++ )
				{
					if(word[i]!=null)
						System.out.println(word[i]+"	"+count[i]);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}