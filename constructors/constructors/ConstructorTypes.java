package constructors;

public class ConstructorTypes {
	int var;
	int var2;

	public static void main(String[] args) {
	
		//Java compiler will add the default constructor
		// on compilation as we don't have any constructor for now
		ConstructorTypes obj=new ConstructorTypes();
		System.out.println("While Obj is created we will no parameter constructor " +obj.var);
		System.out.println("While Obj is created we will no parameter constructor " + obj.var2);
		
		//Rule - 
		// 1. Default constructor will be called only when if 
		//you don't have any constructor within your class
		// 2. Adding default constructor is not our responsibility
		// It will taken care by compiler
		
		ConstructorTypes newobj=new ConstructorTypes(500, 100);
		System.out.println(newobj.var);
		System.out.println(newobj.var2);

	}
	
	
	  // If I add no-parameter Constructor 
	// Constructor is used to initialized value to instance variable	
	public ConstructorTypes() {
	  System.out.println("I am no parameter constructor"); 
	  	var=10;
	  	var2=15;
	  }
	
	// Rule - Constructor can be overloaded 
	// Constructor Type -Constructor with parameter -Parameterized constructor
	// Constructor is called like --->constructorTypes(500,100)
	private ConstructorTypes(int a ,int b) { 
		
		System.out.println("I am parameterized constructor ");
		var=a; //var=500
		var2=b; //var2=100
		
	}
	
	public void M1() {
		System.out.println("I am normal method");
	}

	// Constructor is created to initialized the instance variable
	// Method is created to group the logic (repeated statement)
	
	// Does we called constructor explicitly --Compiler will take care
	// If normal method you need to execute then you have to call
}
