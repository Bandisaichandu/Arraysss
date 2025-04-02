package revature;

import java.util.Arrays;

public class RevArr 
{
	public static void main(String[] args)
	{
		int num=145;
		int temp=num;
		int pro=1;
		int sum=0;
		while(temp>0)
		{
			int ld=temp%10;
		
			for(int i=1;i<=ld;i++)
			{
				pro=pro*i;
				sum=sum+pro;
			}
		}
		System.out.println(sum);
		System.out.println(pro);
	}
}
