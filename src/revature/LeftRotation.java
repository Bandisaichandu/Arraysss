package revature;

import java.util.Arrays;

public class LeftRotation 
{
	public static void main(String [] args)
	{
		int[] a= {2,4,8,9,3,1,5};
		for(int i=0;i<a.length ;i++)
		{
			int lf=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=lf;
		}
		System.out.println(Arrays.toString(a));
	}
}
