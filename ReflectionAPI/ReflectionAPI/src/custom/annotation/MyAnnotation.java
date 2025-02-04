package custom.annotation;

public @interface MyAnnotation {

		int value()  default   0;
	
}


// @MyAnnotation(value="")