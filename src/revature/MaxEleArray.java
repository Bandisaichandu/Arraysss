package revature;

import java.util.Arrays;

public class MaxEleArray
{
	public static void main(String[]args)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int l=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>l)
			{
				l=arr[i];
			}
		}
		System.out.println(l);
	}
}
