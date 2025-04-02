package arrays;

import java.util.Scanner;

public class ArrayEvenElement 
{
	public static void main(String[] args) 
	{
		System.out.println("enter size");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter  a number");
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println("enter the even"+ a[i]);
		}
		}
	}
}
