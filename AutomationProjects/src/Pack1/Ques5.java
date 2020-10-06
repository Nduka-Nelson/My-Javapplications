package Pack1;



public class Ques5 {
	
	public static  void pyramidPattern(int n) 
    {  
		
        int count = n - 1;
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
 
        }
        
    } 

	public static void main(String[] args) {
		//Ques5 Obj = new Ques5();
		
		pyramidPattern(3); 
		

		
		
		
	}

}
