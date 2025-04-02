package arrays;

import java.util.Scanner;

public class ArrayOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a= new int[n];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the nums");
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println("enter odd elements" +"  "+ a[i]);
				sum=sum+a[i];
			}
	
		}
		System.out.println(sum);
	}
}
