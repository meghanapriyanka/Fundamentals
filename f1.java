package fundamentals;

import java.util.Scanner;

public class f1 {
	public static void main(String[]args)
	{
		int a;
		Scanner SC=new Scanner(System.in);
		System.out.println("enter a value");
		a=SC.nextInt();
		if(a<0)
		{
			System.out.println("negative number");
		}
		if(a>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("zero");
		}
	}

}
