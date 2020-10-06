package Pack1;

public class Ques4 {

	public int add(int num1, int num2)
	
	{
		int result = num1+num2;
		
		return result;
		
	}
	
	public int subtract(int result, int num3) {
	 result = result-num3;
	return result;
	}
	
	public int multiply( int result, int num4) {
		
		result = result*num4;
		
		return result;
	}
	public double divide(double result, int num5) {
		
		result = result/num5;
		return result;
	}
	
	public void triangularPattern(int n) {
	
		
	}
	public static void main(String[] args) {
		Ques4 Res = new Ques4();
		int x = Res.add(20,9);
		int y= Res.subtract(x,4);
		int z = Res.multiply(y,3);
		double a = Res.divide(z, 2);
		System.out.println("the result  of addition of two numbers is:"+x);
		System.out.println("the result  of subtraction is:"+y);
		System.out.println("the result  of multiplication is :"+z);
		System.out.println("the result  after division is:"+a);
		
		System.out.println();
		Res.triangularPattern(5);
		

	}

}
