package Pack1;

public class DoLoop {

	public void DoWhileLoop( int n)
	{
		
		 
		    do
		     {
		     System.out.println("value : " + n);
		     n--;
		     }while(n > 0);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoLoop value = new DoLoop();
		value.DoWhileLoop(5);
		

	}
}
