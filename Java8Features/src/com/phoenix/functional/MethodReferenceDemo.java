package com.phoenix.functional;

public class MethodReferenceDemo {
	public static void main(String[]args)
	{
		Movable m=MyClass::aMethod;
		m.move();
		
		YourClass ob=new YourClass();
		m=ob::yourMethod;
		m.move();
		
		//instance  method reference or arbitrary object
		StringMerger sm=String::concat;
		System.out.println(sm.merge("Raja ", "Kumar"));
		
		
		//constructor reference
		Messaging m1=Message::new;
		Message ob1=m1.getObject("Raja");
		System.out.println(ob1.getMsg());
		
		
	}

}
