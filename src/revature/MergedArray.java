package revature;

import java.util.Arrays;

public class MergedArray 
{
	public static void main(String [] args)
	{
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {12,3,45,54};
		int[] c=new int[arr1.length+arr2.length];
		System.out.println(c.length);
		for (int i = 0; i < arr1.length; i++) 
		{
			c[i] =arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) 
		{
			c[(arr1.length)+i] =arr2[i];
			
		}
		System.out.println(Arrays.toString(c));
		
		
		
	}
}
