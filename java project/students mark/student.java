class student 
{ 
	static int sum=0,n=1;
	static int total=0;

	public static void main(String[] args) 
	{
		int raja[]=new int[3];
		raja[0]=60;
		raja[1]=70;
		raja[2]=80;
		int ram[]=new int[3];
		ram[0]=90;
		ram[1]=70;
		ram[2]=80;

		for (int i=0;i<raja.length ;i++)
		{
			sum=sum+raja[i];

			System.out.println("raja "+n+"st  subject mark  is"+ raja[i]);
			n++;
		
		}
		System.out.println("raja MECHANICALC DEPT and total mark is  "+sum);


		System.out.println("*********************************************");
			
		
        for (int j=0;j<ram.length;j++ )
        {
			total=total+ram[j];

			System.out.println("ram "+n+"st  subject mark  is"+ ram[j]);
			n++;
        }
		System.out.println("ram is CSE DEPT and total mark is   "+total);
		
	}
}

