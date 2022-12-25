//////millions of error are there in program



import java.io.*;
class WordRepetation
{
	public static void main(String[] args) 
	{
		count();
	}

	static void count()
	{
		int h=1,x=0,count[]=new int[h], b=0,y=0;
		String word[]=new String[h];
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
					for (int j=0;j<h ;j++ )
					{
						if (b==0)
							break;
						if (word[j].equals(split[i]))
						{
							count[j]++;
							x++;
							System.out.println(word[j]+"	"+count[j]);
						}
					}
					b++;
					if (y==0)
					{
						word[0]=split[i];
						count[0]=1;
						y++;
						x++;
					}
					System.out.println(word[0]+" millions of error are there in program");
							
					if (x==0)
					{
						h++;
						word = new String[h];
						count = new int[h];
						word[h-1]=split[i];
						
						count[h-1]=1;
					}
				}
				s = br.readLine();
			}
			for (int i=0;i<h ;i++ )
			{
				System.out.println(word[i]+"	"+count[i]);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
