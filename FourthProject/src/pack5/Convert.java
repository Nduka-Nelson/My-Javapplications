package pack5;

public class Convert {
	
	static void stringtochar()
	{
		
		String str = "Nelson is here";
		for (int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			System.out.println("Character at "+i+" Position: "+ch);
			
		}
		
		System.out.println();
		
	}

	static void chartostring()
	{
		
	 char ch =  'h';
	 String str = Character.toString(ch);
	 System.out.println("The character is :"+str);
	 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringtochar();
		chartostring();

	}

}
