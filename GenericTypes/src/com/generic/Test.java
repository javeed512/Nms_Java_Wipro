package com.generic;

public class Test {

	public static void main(String[] args) {

			
		 UDGenerics<String> g1 = new UDGenerics<String>("Javeed");
		 
		 g1.show();
		 
		System.out.println( g1.getObj() );
		
		 UDGenerics<Number> g2 = new UDGenerics<Number>(999999L);
		
		 g2.show();
		 
			System.out.println( g2.getObj() );
			
			 UDGenerics<Runnable> g3 = new UDGenerics<Runnable>(new Thread());
		
			 	g3.show();
			 
				System.out.println( g3.getObj() );
		
	}

}
