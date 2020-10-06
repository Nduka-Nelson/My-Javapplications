package Pack1;
 
public class Ques1 {

	public void WhileLoop( int x, int k, int num) {
		
		
		while(x<=num) {
			System.out.println("value is : "+ x);
			
				if(x%k==0) {
					System.out.println(x + " :"+ "  is an even number in the range of 1 to 10" );
				}
				
				else {
					
					System.out.println(x + ":"+ " is an odd number in the range of 1 to 10");
					
				}	
				x++;
			
						
		}
 	
	}
	
	
	
	public static void main(String[] args) {
		
		Ques1 val = new Ques1();
		val.WhileLoop(0,2,10);
		
	}

}
