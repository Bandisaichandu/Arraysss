package arrays;

import java.util.Scanner;

public class ArrayElement 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter an array size");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter elements");
			a[i]=s.nextInt();
			if(a[i]==2)
				System.out.println(i);
		}
	}
}
