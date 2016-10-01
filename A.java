package com.acadgild.java.session4;
 class A {
	 
	 public A(){
		 
		 System.out.println("constructor A called");
	 }
	
}
 
 class B extends A{
	
	public B(){

		this(2);
	
	System.out.println("Constructor B called");
	}
	
	public B(int a){
		System.out.println("Constructor B having integer called");
	}
}

