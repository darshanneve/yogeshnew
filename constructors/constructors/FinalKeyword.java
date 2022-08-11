package constructors;

public class FinalKeyword {
	//instance final variable declaration without initialization 
		public final float pi;
		//static final variable declaration without initialization
		public static final int p;
		//instance final variable declaration with initialization 
		public final int a=5;
		//static final variable declaration with initialization
		public static final int b=34;
		
		//As pi is instance variable and it's final it need to initialized in constructor as it is not initialized yet
		//Variable a is instance and final and already initialized so no need to initialized again
		// static final variable can't be initialized in constructor 
		FinalKeyword(float p){ 
			   pi=p; 
			   System.out.println("I am constructor block");
	    }
		 
		// Same as above constructor 
		FinalKeyword(){ 
			  
				 pi=3.14f; 
				 System.out.println("I am constructor block");
		 }

		//As p is static variable and it's final it need to initialized in static block as it is not initialized yet
		// static block to initialized the static and final variable
		//Variable b is static and final and already initialized so no need to initialized again
			//
		  static { System.out.println("I am static block"); p=3; }
		 
		 

		  // single line comments
		  /*
		   * 
		   * 
		   * MULTILINE  CTRL+SHIFT+/
		   * MULTILINE UNCOMMENT CTRL+SHIFT+\
		   */
		public static void main(String[] args) {
			FinalKeyword obj=new FinalKeyword(3.14f);
			FinalKeyword obj1=new FinalKeyword();
			//obj.pi=45;
			System.out.println(obj.pi);
		}
		
		
		
		public final void M1() {
			
		}
}
