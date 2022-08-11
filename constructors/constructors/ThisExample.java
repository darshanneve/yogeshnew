package constructors;

public class ThisExample {
	//current class name is ThisExample 

		//Three instance variable out of which two local variable is same
		int a;
		int b;
		int c;
		
		//static method 
		public static void main(String[] args) {
			//this represent current class object
			ThisExample obj=new ThisExample();
			//It will be print the obj name 
			System.out.println("Name of obj " +obj);
			// We will be using obj to call M1 method so in current execution
			//this keyword will represent obj object
			obj.M1(); //this will be represent obj
			System.out.println(obj.a);
			ThisExample obj1=new ThisExample();
			System.out.println("Name of obj1 "+ obj1);
			//obj1.M1(); //this will be represent obj1
			System.out.println(obj1.a);
			
		}
		
		public static void M3() {
			
		}
		
		//Non-static /instance method
		public void M1() {
			//if it is Obj.M1() then this will be representing obj
			//if it is Obj1.M1() then this will be representing obj
			this.a=10;  //this is representing object which is calling M1
			this.b=20;
			System.out.println("this value"+this);
			
		}
		
		//Non-static 
		public void M2(int a,int b) {// local variable a & b
			this.a=a;//this keyword is generally use to differentiate between local and instance variable if both is having same name
			c=b;// you don't need to use this here as there is no local variable called as c ,internally compiler will add this keyword
			this.b=b;
		}
}
