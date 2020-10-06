package pack4;

import java.util.Arrays;

public class Duplicate {
	public static void duplicate(int a[])
	{
		System.out.print("The duplicate elements are  : ");
		int len = a.length;
		int i, j;
		int count;
		for(i=0; i<len; i++)
		{
			count =0;
			for (j= i+1; j<len;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				
					
				}
				
			} if( count>=1)
			{
			 
				System.out.print(a[i]+  "  " );
				
			}
			
	
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,5,4,5};
		Arrays.sort(a);;
		duplicate(a);

	}

}
