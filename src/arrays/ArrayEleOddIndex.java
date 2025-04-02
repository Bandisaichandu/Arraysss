package arrays;

import java.util.Scanner;

public class ArrayEleOddIndex 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a array size");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter an elements");
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0 && i%2==1)
			{
				System.out.println("odd index---"+i+"even element----"
						+ a[i]);
				
			}
		}
	}
}
