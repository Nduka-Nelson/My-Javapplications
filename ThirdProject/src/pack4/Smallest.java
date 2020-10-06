package pack4;

import java.util.Arrays;

public class Smallest {

	public static int  MinVal(int a[])
	{
		int i;
		int len = a.length;
		i=0;
		int min = a[i]; 
		for (int j= i+1; i<len; i++)
		{
				if(min> a[j])
				{
				 min = a[j];
				}
		}
		return min;
	
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[] = {1, 5, 10, 20, 40, 80};
		int[] input2 = {6, 7, 20, 80, 100};
		int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
		Arrays.sort(input1);
		Arrays.sort(input2);
		Arrays.sort(input3);
		
		 int x = MinVal(input1);
		 int y = MinVal(input2);
		 int z = MinVal(input3);
		 System.out.println("The smallest in input1 is: "+x);
		 System.out.println("The smallest in input2 is: "+y);
		 System.out.println("The smallest in input3 is: "+ z);
		
	
		

	}

}
