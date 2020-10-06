package Pack1;

public class ques8 {

		public  void BitwiseOperator(int x, int b) {
		
	    x &= b;
	    System.out.println(x);
		
		}	
		public  void bitwiseOperator(int n, int c) {
			
		   n|= c;
		    System.out.println(n);
			
			}	
	public static void main(String[] args) {
		
		ques8 K = new ques8();
		K.BitwiseOperator(2,3);
		K.bitwiseOperator(3,4);

	}

}
