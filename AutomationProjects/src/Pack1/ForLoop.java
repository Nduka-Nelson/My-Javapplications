package Pack1;

public class ForLoop {

	
	
	public void Forloop(int n)
	{
		int i, j;
		
		for (i=1;i<n; i++)
		{
	
				for(j =1; j<=i;j++) {
					
					System.out.println(i  +"|"+ j);
					
				}
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop f = new ForLoop();
		f.Forloop(5);

	}

}
