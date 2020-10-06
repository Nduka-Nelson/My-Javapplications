package Pack1;

public class FirstJavaProgram {

	public int add(int a, int b) {
		
		int c = a+b;
		 return c;
	}
	public int sub(int c, int f) {
		 
		int d = c-f;
		  return d;
	 }
	public int mult( int d, int z) {
		  
		 int e = d*z;
		 return e;
	  }
	public static void main(String[] args) {
		
		FirstJavaProgram A= new FirstJavaProgram();
		int y = A.add(10, 20); 
		int x = A.sub(y, 6);
		int z = A.mult(x, 4);
		
		System.out.println("the sum of a and b is : "+y);
		System.out.println("the difference between c and f is:"+x);
		System.out.println("the multiplication between  d and z is : "+z);

		

	
	}

	
	
	
	
}
