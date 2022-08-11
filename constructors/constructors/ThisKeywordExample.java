package constructors;

public class ThisKeywordExample {

	public static void main(String[] args) {
		
		ThisKeywordExample obj=new ThisKeywordExample();
		obj.marks();
	}
	
	public void marks()
	{   //within non static method ,if you want to call 
		//non static method object creation is not mandatory
		show();
		//why it is mandatory
		//there is one keyword given by java----this
		//this represent current class instance
		//this will represent obj
	}
	public void show()
	{
		
	}
	public static void noshow()
	{
		//within static method ,if you want to call 
				//non static method object creation is mandatory
	}
}
