package fundamentals;

public class Sum {
	public static void main(String[] args) {
		int num=1234,c=0,s;
		while(num>0) {
			s=num%10;
			c=c+s;
	        num=num/10;
	        
	        
		}	
		System.out.println(c);
		
	}

}
