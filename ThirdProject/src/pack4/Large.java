package pack4;



public class Large {
	public static int FindLarge(int a[][])
	{
		int len = a.length;
		int i,j;
		int max = Integer.MIN_VALUE;
		for(i=0;i<len;i++) 
		{
			
			for (j=0; j<len;j++)
			{
			
				if(a[i][j]> max)
				{
				
				 max = a[i][j];
				 
				} 
			}	
			
			
		}
		
		return max;
	}
	public static int FindSmallestInColum(int a[][])
	{
		int len = a.length;
		int i;
		int j = 0;
		
		int min = Integer.MAX_VALUE;
		for(i=0; i<len;i++)
		{
				
				if (a[i][j]<min)
				{
					
					min = a[i][j];	
				
			}
			
		}
		
		return min;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{3,4,7},{1,3,6},{12,3,0}};

		 int x =FindLarge(a);
		 System.out.println("the Largest is: "+ x);
		int y = FindSmallestInColum(a);
		System.out.println("the smallest is: "+ y);
	}
	

}
