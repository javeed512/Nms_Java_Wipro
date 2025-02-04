package com.apis;

public class BuiltInAnnos {

	public static void main(String[] args) {


		@SuppressWarnings("unused")
		int x;
		
		
		m1();
		
	}
	
	@Deprecated
	public static void m1() {
		
		System.out.println("m1()...");
	}
	
	
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
