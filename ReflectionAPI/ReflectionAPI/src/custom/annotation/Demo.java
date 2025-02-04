package custom.annotation;


@MyAnnotation(value=101)
public class Demo {
	
	@MyAnnotation(value=102)
	int id;
	
	
	@MyAnnotation
	public Demo( @MyAnnotation int eid) {
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
