package arrays;

import java.util.Scanner;

public class IndexValueofElement
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enetr an array Size");
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enetr elements");
			arr[i]=s.nextInt();
		}
		System.out.println("enter the element to check for its index");
		int ele=s.nextInt();
		boolean ispresent=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(ele==arr[i])
			 ispresent=true;
		}
		if(ispresent)
		{
			System.out.println("s");
		}
		else
		{
			System.out.println("n");
		}
	}
}
