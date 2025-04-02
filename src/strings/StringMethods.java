package strings;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s="javadeveloper";
		for(int i=1;i<=s.length()-1;i++)
		{
			if(i!=0 && i%2==1)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
