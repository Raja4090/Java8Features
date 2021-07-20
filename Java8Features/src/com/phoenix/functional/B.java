package com.phoenix.functional;

public interface B {
	default void test()
	{
		System.out.println("Hello Deafual B");
	}

	static void show()
	{
		System.out.println("Show B");
	}
}
