package com.phoenix.functional;

@FunctionalInterface
public interface Addable {

	int add(int a,int b);
	
	default float addFloats(float a,float b)
	{
		return a+b;
	}
	
	static void show()
	{
		System.out.println("Show of Addable");
	}
}
