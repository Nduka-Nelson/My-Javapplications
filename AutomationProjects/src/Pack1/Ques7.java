package Pack1;

public class Ques7 {
 public boolean NotEqualToOr( int a, int b ) {
	 
	 boolean result;
	 int sum = a+b;
	 if((sum!= 8)|| (sum <= 8)) {
		 
		 result = true; 
	 }
	 
	 else {
		 
		 
		 result = false;
		 
	 }
	  return result;
 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques7 x = new Ques7();

		boolean res;
		res =  x.NotEqualToOr(5, 3);
		System.out.println("the answer is :"+ res);
		
	}

}
