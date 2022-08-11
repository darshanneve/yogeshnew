package constructors;

public class FirstConstructor {
	int a;
	int b;
	
	
	//FirstConstructor()-- It is similar to Method but name of constructor will always
	// be same as class name
	
	// Whenever you create object--constructor will be called
	
	// why we constructor -
			//we create two instance variable
			// who will allocate memory and 
			// who will assign the default value
	public static void main(String[] args) {
		//local 
		FirstConstructor obj=new FirstConstructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		FirstConstructor obj1=new FirstConstructor();

	}
	
	// To create constructor 
			//A. Name of constructor should be same a classname
			//B. Constructor doesn't have return type

		//Constructor Syntax
		
			//Access_Modifier Classname(){
					//constructor body
			//}
	
		// Method syntax
			//Access_Modifier Return_Type Method_Name() {
				//method body
			//}
	
	//Rule 2 - If you have constructor with return type like below
	// Then compiler will treat as normal method not the constructor
	// So it will not call while object creation
	public void FirstConstructor() {
		System.out.println("This is my first constructor");
		a=5;
		b=10;
	}
	
}
