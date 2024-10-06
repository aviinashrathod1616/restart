package com.restart.java8;

public class InterfaceDemo implements NewInterface{
	
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo=new InterfaceDemo();
		NewInterface.hello();
		
		 // Calling the abstract method of interface
        interfaceDemo.overrideMethod("Hello, Override Method here");
	}

	@Override
	public void overrideMethod(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		
	}

}
