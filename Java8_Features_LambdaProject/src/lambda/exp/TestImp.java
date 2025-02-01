package lambda.exp;

public class TestImp  implements MyInterface{ // traditional implementation

	@Override
	public int add(int a, int b) {


		return  a+b;
	}
	
		public static void main(String[] args) {
			
			MyInterface mi    =  new TestImp();
			
				int result = 	mi.add(4, 5);
				
				System.out.println("Result : "+result);
			
			
		}
	
	

}
