package revature;


import java.util.HashSet;

public class DuplicateEle 
{
	public static void main(String [] args)
	{
		int arr[]= {2,3,4,5,5,7,4,3,2,1,4,8,9,4,5};
		for (int i = 0; i < arr.length; i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j]) 
				{
					System.out.print(arr[i]);
				}
			}
		}
		
	}
}
