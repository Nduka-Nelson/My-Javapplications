package Pack1;

public class Ques3 {

	public int Greaterthan( int n1, int n2, int n3)
	
	{
		int result;
		if (n1> n2 && n1> n3) {
		
		result = n1;
		}
		
		else if(n2>n1 && n2>n3) {
			
			result = n2;
		}
		else {
			
			
			result = n3;
		}
		
		return result;
		
	}
	
	
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques3 v = new Ques3();
		int res = v.Greaterthan(6, 4, 3);
		System.out.println("the greatest of all is:" +res);
		
	}

}
