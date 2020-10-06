package Pack1;

public class Ques6 {

	 public void PrintDiamond(int number) 
    { 
        
		 
	        int count = number - 1;
	        for (int k = 1; k <= number; k++) {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count--;
	            for (int i = 1; i <= 2 * k - 1; i++)
	                System.out.print("*");
	            System.out.println();
	        }
	        count = 1;
	        for (int k = 1; k <= number - 1; k++) {
	            for (int i = 1; i <= count; i++)
	                System.out.print(" ");
	            count++;
	            for (int i = 1; i <= 2 * (number - k) - 1; i++)
	                System.out.print("*");
	            System.out.println();
	        } 
		  
		 
    } 
	public static void main(String[] args) {
		
		Ques6 Z = new Ques6();
		Z.PrintDiamond(3);
		

	}

}
