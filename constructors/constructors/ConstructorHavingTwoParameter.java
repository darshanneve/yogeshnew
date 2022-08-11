package constructors;

public class ConstructorHavingTwoParameter {
	int var;
	float var1;
	int var2;
	
	public ConstructorHavingTwoParameter(int a , float b) {
		
		System.out.println("I am 500 Voucher");
		
	}
	
public ConstructorHavingTwoParameter(int a , float b, int c) {
		var=a;
		var1=b;
		var2=c;
		System.out.println("Three parameter constructor offer extended " + var + var1  + var2 );
		 
	}
	
	public ConstructorHavingTwoParameter() {
		
		//int a; --As we are calling another constructor so this should be your first statement
		
		
		//constructor chaining --calling one constructor from another
		// To call another constructor we have use this keyword
		// As we have three parameterized constructor which we have to call
		//so with this we have to pass three parameter
		this(63,75,93); 
		//System.out.println("I am not giving any voucher");
	}
	
	
	public static void main(String[] args) {
	
		// Two people register on 26th Jan -As per company policy we need to give 500 
		ConstructorHavingTwoParameter test=new ConstructorHavingTwoParameter(2,3);
		ConstructorHavingTwoParameter test1=new ConstructorHavingTwoParameter('C',34.34f);
	
		// Two more people register but on 27th Jan
		ConstructorHavingTwoParameter test2=new ConstructorHavingTwoParameter();
		ConstructorHavingTwoParameter test3=new ConstructorHavingTwoParameter();
	
		
		
	}

}
