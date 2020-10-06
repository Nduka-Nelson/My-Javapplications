package pack5;

public class CountVowelsAndConsonants {

	static void countvowwelsCons()
	{
		
		int vowels = 0;
		int consonants= 0;
		String str =  "Hello what is your name";
		String s =  str.trim();
		for (int i =0; i< s.length()-1; i++)
		{
		
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||  
					s.charAt(i)=='u'&& s.charAt(i)!= ' ')
			{
				 vowels++;
			}
			else if(s.charAt(i)!= 'a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||  
					s.charAt(i)!='u' || s.charAt(i)== ' ' )
			{
		
			consonants++;
			}
			
		}
		
		
		System.out.println("the vowels are : "+ vowels);
		System.out.println("the Consonanats are : "+ consonants+"  ");
		System.out.println();
		System.out.println();
	}
	
	static void FindDuplicate()
	{
		int count = 0;
		int j, i;
		String res =  "Hello Word";
		
		String s =  res.trim();
		char ch[] = s.toCharArray();

		for(i =0; i<s.length(); i++)
		{
			 
			for(j= i+1; j<s.length(); j++)
			{
				
				if ( ch[i]==ch[j] && ch[i] !=' ' )
				{
					System.out.print(ch[i]+" ");
					count++;
				}
				
			}
			/*if(count>0)
			{	
			System.out.println(" the duplicates are "+ s.charAt(i));
			break;
			}*/
		}
		System.out.println();
		System.out.println();
	}
	
	static void findCharOccurence()
	{
		
		int count =0;
		String s = "Hello";
		String  tre = s.trim();
		char ch[] = tre.toCharArray();
		int i;
		 for ( i =0; i<ch.length-1;i++ )
		 {
			 
			 if( ch[i]=='l')
			 {
				 count++;
				 
			 }
				  
			if (count>=1)
			{
				
				System.out.println(ch[i]  +" is in position "+i );
				
			}
				
			 
		 }	 
		 System.out.println();
	}
	static void  BulbleSort()
	
	{
		
		 String str = "Canada Is In North America Really";
		 String k[] = str.split(" ");
		String temp;
		System.out.println("Strings in sorted order:");
		for (int i = 0; i < k.length; i++) {
	   	   for (int j = i + 1; j < k.length; j++) {
			// comparing adjacent strings
			if (k[i].compareTo(k[j]) >0) {
				temp = k[i];
				k[i] = k[j];
				k[j] = temp;
			}
		   }
		   System.out.print(k[i]+"  ");
		}
		System.out.println();
		System.out.println();
	}
	  static void ReverseWord()
	  {
		 System.out.print("The reverse of the words is:");
		 String str = "My Name is Nelson";
		 String[] word = str.split(" ");
		 String rev = " ";
		 for(int i =word.length-1; i>=0;i-- )
		 {
			 rev = rev+" "+ word[i];
			 //System.out.println(rev[i]);
			
		 }
		 
		 System.out.println(rev);
		 System.out.println();
	
	  }
	 static void StringsInalphabeticaOrder()
	 {
		 System.out.print("Strings in Alpabetical  order:"); 
		 String a  = "Canada Is My Country";
		 String b[] = a.split(" ");
		 String temp;
		 int i,j;
		 for (i=0;i<b.length;i++)
		 {
			 for (j=i+1;j<b.length;j++)
			 {
				 
				 if(b[i].compareTo(b[j]) >0)
				 {
					 temp = b[i];
					 b[i] = b[j];
					 b[j] = temp;
				
				 }
				 
			 }
			 
			 System.out.print(b[i]+"  "); 
		 }
	 }
	 
	  
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countvowwelsCons();
		
		
		System.out.print("The duplicates are  : ");
		FindDuplicate();
		System.out.println();
		
		 findCharOccurence();
		 System.out.println();
		 BulbleSort();
		 ReverseWord();
		 StringsInalphabeticaOrder();
		

	}

}
