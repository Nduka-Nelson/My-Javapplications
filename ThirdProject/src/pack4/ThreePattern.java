package pack4;

public class ThreePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("\nThe star pattern is... ");
		for (int m = 0; m<=4 ; m++)
		{
			
			for (int n=0; n<=5-m; n++)
			{
			System.out.print(" ");
			}
			
			for (int p=0; p<=m; p++)
			{
			System.out.print("* ");
			}
			
			
			System.out.println();
			}
			
		
		for (int m = 4; m>=0; m--)
		{
			for (int n=0; n<5-m; n++)
			{
			System.out.print(" ");
			}
			for (int p=0; p<= m; p++)
			{
			System.out.print(" *");
			}
			System.out.println();
			}
	}

}
