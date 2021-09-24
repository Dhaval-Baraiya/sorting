	
import java.util.*;
public class sorting{
	
	public static void main(String args[])
	{
		final String w = "pybrxwuvncehkolfagjqszidmt";
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];
		int index[] = new int[20];
		
		char[][] ch = new char[str.length][];
		for(int i = 0 ; i<str.length;i++)
		{
			str[i] = sc.nextLine();
		}
	
		for(int i = 0 ; i<str.length;i++)
		{
			ch[i] = str[i].toCharArray();
			index[i] = w.indexOf(ch[i][0]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			for(int j = i+1 ;j< str.length; j++)
			{
				if(index[i] > index [j])
				{
					String tmp = new String();
					tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;	
				}
				if(index[i] == index[j])
				{
						int in[] = new int[30];
						for(int k = 0 ; k<str.length;k++)
						{
				
							in[k] = w.indexOf(ch[k][1]);
						}
		
						if(in[i] > in[j])
						{
							String temp = new String();
							temp = str[i];
							str[i] = str[j];			
							str[j] = temp;	
														
						}				
				}
			}
		}
		for(int i = 0 ; i<str.length;i++)
		{
			System.out.println(str[i]);
			
		}
	}
}