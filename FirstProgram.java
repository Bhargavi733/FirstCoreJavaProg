package Basic;

public class FirstProgram {
	void colorList()
	{
		System.out.println("Black");
		System.out.println("White");
		System.out.println("Blue");
		System.out.println("Red");
		System.out.println("Pink");
	}
	void profile()
	{
		System.out.println("Name - Bhargavi R");
		System.out.println("Place - Bangalore");
		System.out.println("Age - 21");
		System.out.println("Qualification - BE");	
	}
	
	public static void main(String[] args) {
		System.out.println("Hello, How are you..!");
		System.out.println("Find the list of colors Below..!");
		FirstProgram p=new FirstProgram();//Object creation
		p.colorList();//call method
		p.profile();
	}

}
