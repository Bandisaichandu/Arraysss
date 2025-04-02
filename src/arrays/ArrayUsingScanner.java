package arrays;

import java.util.Scanner;

public class ArrayUsingScanner
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter a number");
			a[i]=s.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("elements present in index" 
					+"-"+i+"-->" +a[i]);
		}
	}
}
