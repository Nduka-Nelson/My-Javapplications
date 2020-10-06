package pack4;

import java.util.Arrays;

public class Rept {
	public static void  Repeat(int a[], int size)  
    { 
        int i, j;
        
        System.out.println("Repeating Elements are :"); 
        
        for (i = 0; i < size; i++)  
        { 
        
            for (j = i+1; j < size; j++)  
            { 
                if (a[i] == a[j]&& i!=j)
                	
                	
                
                    System.out.println(a[i] + " "); 
               
            }
             
        }
         
      } 
	 public static void NonRepeat(int a[],int n)
     {
         int count;
         System.out.println("Non repeating elements in array are");

        for(int i=0;i<n;i++)
        {
            count=0;
            //Initialize the for loop for checking the element which are not repeated
            for (int j = 0; j < n; j++)
            {
               //check the condition if any number is same so
               //increment
               if(a[i]==a[j] && i!=j)
                      count++;
            }
         //if count became zero so print the current element
         if(count==0)
             System.out.print((a[i])+" "+"\n");
        }
      }
	 public static  void FirstRepeat(int a[],int size)
	 {
		 
		 int i, j;
		 int count;
		 
	        
	        System.out.println(" First Repeating Element is :"); 
	        
	        for (i = 0; i < size; i++)  
	        { 
	        	count =0;
	        
	            for (j = i+1; j < size; j++)  
	            { 
	            	
	                if (a[i] == a[j]&& i!=j)
	                	 
	                count++;
	               
	            }
	            if(count ==1)
	            {
	            	 System.out.println((a[i])+"\n");
	            	break;
	            }
	             
	        }
		 
	        
	 }
	 public static void NonFirstRepeat(int a[],int n)
     {
         int count;
         System.out.println("First non repeating elements in array is");

        for(int i=0;i<n;i++)
        {
            count=0;
            //Initialize the for loop for checking the element which are not repeated
            for (int j = i+1; j < n; j++)
            {
               //check the condition if any number is same so
               
               if(a[i]==a[j] && i!=j)
               {
                      count++;// increment counter;
               }
            }
            if(count==0) 
            {
             System.out.print((a[i])+" "+"\n");
             break;
            }
         
        }
      }
	 
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[] = {4, 2, 4, 5, 2, 3, 1,6,9,5}; 

		int len = a.length;
		Arrays.sort(a);
		Repeat(a,len);
		NonRepeat(a,len);
		FirstRepeat(a,len);
		NonFirstRepeat(a,len);

	}

}
