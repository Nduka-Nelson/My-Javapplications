//Access modifiers with protected
package pack3;
import pack2.*;
public class B extends A {

protected	void adder( int a, int b) 
	{
		int sum = a+b;
		System.out.println("the sum is :"+ sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();  
		   obj.msg(); 
		 int x=  obj.addTwoNumbers(4,5);
		 System.out.println(x);
		  System.out.println("the value is :"+obj.c);
		  
	}

}
