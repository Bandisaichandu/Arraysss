package arrays;

public class MaxEleInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {4,8,9,4,5,6,3};
		int max=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
