package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ArryRun
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		System.out.println("enter the elements u want to store in arrays");
		for(int i=0;i<=n;i++)
		{
			int b=s.nextInt();
			System.out.println(b);
		}
	}
}
