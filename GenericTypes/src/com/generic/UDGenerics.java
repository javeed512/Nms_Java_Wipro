package com.generic;

public class UDGenerics<T extends Object> {
	
		T obj;

		public UDGenerics(T obj) {
			super();
			this.obj = obj;
		}
		
		public void show() {
			
			System.out.println("Type of object: "+obj.getClass().getName());
			
		}

		
		public T  getObj() {
			
			return obj;
			
		}
		
}
