package constructors;

public class Test {
      int a;
      
      //test class constructor
      //no parameterized constructor
      //constructor can be overloaded name is same but signature is different
      private Test()
      {
    	  System.out.println(" I am Test class");
    	  a=5;
      }
      
      public Test(int var)
      {
    	  System.out.println(" I am parameterized constructor");
    	  a=var;
      }
      
     public static void main(String[] args) {
    	 //compiler will add default constructor only when there is no constructor
    	 //whenever no parameterized constructor is called default value should 5
		Test t=new Test();
		//whenever no parameterized constructor is called default value should be the value  
		//which is pass as a parameter
		System.out.println(t.a);
		Test t1=new Test(15);
		System.out.println(t1.a);
	}
}
