package arrays;

import java.util.Scanner;

public class ElementInArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an array Size");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter an array ele");
			a[i]=s.nextInt();
		}
		System.out.println("enter element to check");
		int ele=s.nextInt();
		boolean ispresent=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==ele)
				ispresent=true;
		}
		if(ispresent)
			System.out.println("s");
		else
			System.out.println("n");
	}
}
