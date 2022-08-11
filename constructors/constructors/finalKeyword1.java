package constructors;

public class finalKeyword1 {
	//instance variable- written class outside method without static
		//If you want your variable to be treated as constant then use final keyword
		public final float pi=3.14f;
		
		//Syntax to write the final variable
		//<access_modified><non_accessModifier> <data_type><variable>
		
		//If you write any variable as final you need to initialized it else you will compilation error
		 //public final int a;
		
		// There are two ways to initialized instance final variable
		
		 //First way - You declare final variable and initialized at the same
		public final int b=2; //declaration +initialization
		
		//Second way - you declare the final variable but initialized in constructor
		//declare the final variable
		public final int c;
		
		//creating final static variable 
		public final static int d=5; //declaration and initialization is in same line
		
		//creating final static variable but initializing in static variable
		public final static int e;
		
		
		//Constructor Syntax
		//access_modifier No return type and name should be same as class name
		// Initialising the final variable c in constructor 
		  public finalKeyword1() {
			  	c=3;
			  	System.out.println("I am from constructor");
			 }
		 
		  // There is concept called as block
		  // it will be executed when your class will load
		  static {
			  e=45; //to initialized the final static variable
			  System.out.println("I am static block");
			  m1(); //Executing static method from static block
			  finalKeyword1 obj1=new finalKeyword1(); 
			  obj1.m2(); //you can call non-static as well but it is not recommended 
		  }
		  
		
		  public static void main(String[] args) {
			 finalKeyword1 obj=new finalKeyword1();//child 
			 //Compiler is throwing error as we are trying to edit the value of final variable/constant 
		  //obj.pi=45;
		    System.out.println(e);
		 
		  
		  
		  }
		  
		  public static void m1() {
			  System.out.println("I am static M1 method");
		  }
		  
		  public void m2() {
			  System.out.println("I am non static method M2");
			  this.m3();
			  
		  }
		 
		  public void m3() {
			  System.out.println("I am non static method M3");
		  }
		 
}
