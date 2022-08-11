package constructors;

public class Constructor3 {

	//there are two Constructor in class
	//1st Constructor parameterizedConstructor
	public Constructor3(int a,int b)
	{
		System.out.println("I am in parameterized Constructor "+a+" "+b);
	}
	//2st Constructor---- no parameterized Constructor
	public Constructor3()
	{
		this(1,2);//parameterized Constructor
		System.out.println("I am in no parameterized Constructor");
	}
	
	//Constructor chaining----calling one Constructor within another Constructor 
	//when you have to call one Constructor within another we have to use this keyword
	public static void main(String[] args) {
		Constructor3 t=new Constructor3();
	}
}
