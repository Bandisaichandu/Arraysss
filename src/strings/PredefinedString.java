package strings;

public class PredefinedString 
{
	public static void main(String[] args) {
		String s="java1201423";
		int digitcount=0;
		int alphacount=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				digitcount++;
			}
			else if(Character.isAlphabetic(ch))
			{
				alphacount++;
			}
		}
		System.out.println(digitcount);
		System.out.println(alphacount);
	}
}
