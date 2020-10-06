package pack5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {

	
	static void CheckWithStack()
	{
		String str = " My Friend is Here";
		Stack  s = new Stack();
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
		

        while (!s.isEmpty()) {
            rev = rev+s.pop();
        }

        if (s.equals(rev))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
        System.out.println();
	}
	  static  void CheckWithQueue()
	{
		  String str = " My Friend is Here";
		  String rev = "";
		  Queue q = new LinkedList();
		  for (int i = str.length()-1; i >=0; i--) {
	            q.add(str.charAt(i));
	        }
			

	        while (!q.isEmpty()) {
	            rev = rev+q.remove();
	        }

	        if (!q.equals(rev))
	            System.out.println("The input String is a palindrome.");
	        else
	            System.out.println("The input String is not a palindrome.");
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckWithStack();
		CheckWithQueue();

	}

}
