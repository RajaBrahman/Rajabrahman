import java.util.Scanner;
class find 
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) 
	{
		System.out.println("ENTER THE NUMBER ");
		int num=sc.nextInt();
		int ans=0;

		for (int i=0;i<num ;i++ )
		{
			if (i*(i+1)== num)
			{
				ans=1;

				break;
			}
			
		}
		if (ans ==1)
		{
		 
		 System.out.println("it is a pronic mnumber");

		}
		else
		{
		System.out.println("it is not a pronic mnumber");

		}
	}
}

