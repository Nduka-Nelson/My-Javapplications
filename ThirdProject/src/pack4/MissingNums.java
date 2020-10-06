package pack4;



public class MissingNums {
	private static void findMissingNumber(int[] number){
		 
        // take max length as last number in array
    int[] k = new int[number[number.length-1]];
        
  int m=0;
 
  if(number[0]!=1){
   for (int x = 1; x < number[0]; x++) {
       k[m] =  x;
       m++;
       }
  }
        
 for (int i = 0; i < number.length -1; i++) {
    
    int j = i+1;
    int difference = number[j] - number[i] ;
            
            
   if(difference != 1 ){
        
  for (int x = 1; x < difference; x++) {
 
          k[m] = number[i] + x;
           m++;
    
}
            
 }
 }
        
System.out.print("missing numbers in array :: ");
        
for (int l = 0; l < m ; l++) {
    System.out.print(k[l]+ "  ");  
}
}
 public static void main(String[] args) {
        
	 int a[] = {1,2,3,4,5,8,9,10};
 
   //if Array is not sorted :To sort array use Arrays.sort(a); 
 
  findMissingNumber(a);
 
   
}
}


		