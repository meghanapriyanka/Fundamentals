package fundamentals;

public class Palindrome {
	public static void main(String[] args) {
		int num=110011,c=0,s,rev;
		rev=num;
		while(num>0) {
			s=num%10;
			c=c*10+s;
	        num=num/10;
	        
	        
	        
		}
		if(rev==c)
		System.out.println("palindrome");
		else
			
	System.out.println("not a palindrome");
		
	}

}
