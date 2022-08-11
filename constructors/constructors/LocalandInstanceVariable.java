package constructors;

public class LocalandInstanceVariable {

	int a;
	int b;
	int var;
	
	public LocalandInstanceVariable()
	{
	     System.out.println(" i am in no parameterizedonstructor");	
	}
	public static void main(String[] args) {
		LocalandInstanceVariable t=new LocalandInstanceVariable();
		t.testing(5,10);
		System.out.println(t.a);
		System.out.println(t.b);
		
		LocalandInstanceVariable t1=new LocalandInstanceVariable();
		t1.testing(25,110);
		System.out.println(t1.a);
		System.out.println(t1.b);
	}
	
	//static is nonstatic method having two local variable a and b
	//instance variable will should be initialized with help of local variable
	public void testing(int a,int b)
	{
		var=a;
		//assign local variable value to instance variable a
		this.a=a;
		this.b=b;
	}
}
