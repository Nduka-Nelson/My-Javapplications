package Pack1;

public class Demo2 {

public void AlphabetPattern(int n) {
		
	 

    for(int i = 1; i <= n; i++) {

    	 char ch = 'A';
        for(int j = 1; j <=i; j++) {
        	
            System.out.print(ch +" ");
            ch++;
        }

        System.out.println();
    }	

 }
		
    
	
public static void main(String[] args) {
		
 
		Demo2 D =  new Demo2();
		D.AlphabetPattern(5);
		
		
		
	}

}



