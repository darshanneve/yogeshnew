package constructors;

public class ConstructorPractice {
	public int a ;
	int b;
	boolean c;
	static int d;
	
	
	//Constructor are similar to method but not actually method
	//Constructor name should be similar to class name and it should not have return type 
	//If you dont provide --Complier will add default constructor
	
	
	 // this is no parameterized constructor 
	  public ConstructorPractice() { 
	  // Constructor Chaining- Calling one constructor from  another constructor 
	  // To call same class constructor we need to use this()
	// it is calling another constructor within same class having one parameter
		  this(55,556); // It should be on first line if we add in another line then you will get compiler error
		   System.out.println("I am in no parameter constructor " + a); 
	  
	  
	  }
	  
	  // This is single parameter constructor 
	  public ConstructorPractice(int ab) { //a=10 a=ab;
		  
	  System.out.println("I am parameterized constructor");
	  
	  }
	 
	  //This is two parameter constructor 
	  public ConstructorPractice(int ab, int c) { //a=10 a=ab;
		  this(ab);
		  System.out.println("I am two parameterized constructor");
		  
		  }
		 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It will create object having name obj and call no parameter constructor 
		//Below line will two thing it will create object+constructor call 
		//what constructor will do  --it will initialized the variable
		ConstructorPractice obj=new ConstructorPractice(); 
		
		//It will call now two parameter constructor with same object
		obj=new ConstructorPractice(5,6);
		
		//It will create new object with name obj1 and it will call two parameter constructor 
		ConstructorPractice obj1=new ConstructorPractice(5,6);
		/*
		 * 
		 * 
		 * System.out.println(obj.a); System.out.println(obj.b); //10
		 * System.out.println(obj.c);
		 */

	}

}
