package pack4;

import java.util.Arrays;

public class Alternator {
	public static int partition(int[] A)
	{
		int j = 0;
		int First = 0;	// consider 0 as pivot

		// each time we find a negative number, j is incremented
		// and negative element would be placed before the pivot
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] < First)
			{
				
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;

				j++;
			}
		}

		// j holds index of first positive element
		return j;
	}

	// Function to rearrange given array such that it contains positive
	// and negative numbers at alternate positions
	public static void rearrange(int[] A)
	{
		// partition given array such that all positive elements move
		// to end of the array
		int p = partition(A);

		// swap alternate negative element from next available positive
		// element till end of array is reached or all negative or
		// positive elements are exhausted.
		for (int n = 0; (p < A.length && n < p); p++, n += 2) {
			// swap A[n] with A[p]
			int temp = A[n];
			A[n] = A[p];
			A[p] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]=	{1, 2, 3, -4, -1, 4};
	int len =a.length;
	rearrange(a);

	// print the rearranged array
	System.out.println(Arrays.toString(a));

	}

}
