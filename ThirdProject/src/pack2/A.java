package pack2;
// Access modifiers with Private and protected members
public class A {
	private int a =5;
	 private int b= 7;
	 protected int c =9;
	 int d = 12;

	protected void msg()
	{
		System.out.println("Hello");
	}
	
	protected int addTwoNumbers(int a, int b)
	{
		return a+b;
	}
	
	void Do() {
		
		System.out.println("howw are you ?");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A val= new A();
	System.out.println(val.a);
		

	}

}
