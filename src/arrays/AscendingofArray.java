package arrays;

public class AscendingofArray {
	public static void main(String[] args) {
		int []a= {5,4,3,2,1};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-2;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array in ascending order:");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
