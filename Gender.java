package fundamentals;

public class Gender {
	public static void main(String[] args) {
		String gender="male";
		int age=67;
		
		if((gender=="Female")&&(age>=1&&age<=58))
		{
			System.out.println("8.2%");
		}
		if((gender=="Female")&&(age>=59&&age<=100))
		{
			System.out.println("9.2%");
		}
		if((gender=="male")&&(age>=1&&age<=58))
		{
			System.out.println("8.4%");
		}
		if((gender=="male")&&(age>=59&&age<=100))
		{
			System.out.println("30.5%");
		}
	}

}
