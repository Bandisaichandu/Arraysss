package strings;

public class NoofAlphaandDig 
{
	public static void main(String[] args)
	{
		String s="Java123";
		int alphacount=0;
		int digitcount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z'))
			{
				alphacount=alphacount++;
			}
			else if(ch>='0' && ch<='9')
			{
				digitcount=digitcount++;
			}
		}
		System.out.println(alphacount);
		System.out.println(digitcount);
	}
}
