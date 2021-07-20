package com.phoenix.functional;

public interface A {

	default void test()
	{
		System.out.println("Hello Deafual A");
	}
	
	static void show()
	{
		System.out.println("Show A");
	}
}
