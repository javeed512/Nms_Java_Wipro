package lambda.exp;


// Note: lambda exp is an implementation to any functional interface only.
// The return type of any lambda exp will be functional interface
public class Demo {

	public static void main(String[] args) {

							// implementation to Functional interface nothing but lambda exp
		 MyInterface mi = (int a, int b)->{  return a+b;  };
		     
		  System.out.println("Result "+ mi.add(10, 20));

		  m1( (x,y)-> x+y );
		  
	}
	
	public static void m1(MyInterface mi) {
		
		
		System.out.println("m1() is callled.");
		
	}

}
