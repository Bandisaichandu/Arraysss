package strings;

public class StringEqual 
{
	public static void main(String[] args) 
	{
		String username="Admin";
		int password=123;
		if(username.equalsIgnoreCase("Admin"))
		{
			if(password==1234)
			{
				System.out.println("login Successful");
			}
			else
			{
				System.out.println("password wrong");
			}
		}
		else
		{
			System.out.println("enter ");
		}
	}
}
