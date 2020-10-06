package pack4;

import java.util.Arrays;

public class ZeroAndNonZeros {
	public static  void SepZerosFromNonZeros(int a[])
	{
		int len = a.length;
		
		int pos = len-1;
		
		 for (int i= len-1; i>=0; i--)
		 {
			 if (a[i]!=0)
			 {
				 a[pos] = a[i];
				 pos--; 
			 } 
			 
		 }
		 while(pos>=0)
		 {
			 a[pos]=0;
			 pos--;
			 
		 }
		
		System.out.print("The result is : "+ Arrays.toString(a));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,12,3,4,0,1,4,5,0,0};
		
		SepZerosFromNonZeros(a);

	}

}
