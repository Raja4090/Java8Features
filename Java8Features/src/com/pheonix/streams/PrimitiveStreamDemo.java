package com.pheonix.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream ins=IntStream.of(70,30,20,60,10);
		ins.forEach(System.out::println);
		
		IntStream ins1=IntStream.of(70,30,20,60,10);
		System.out.println("\n\nSorting in asc:\n");
		ins1.sorted().forEach(System.out::println);

		
		System.out.println("\n\nUsing Iterate\n");
		IntStream ins2=IntStream.iterate(1,i->i+2);
		ins2.limit(10).skip(5).forEach(System.out::println);
		
		IntStream ins3=IntStream.of(70,30,20,60,10);
		ins3.sorted().forEach(System.out::println);
		
		
		System.out.println("\n\nUsing LongStream exclusive upper:\n");
		LongStream ls=LongStream.range(100L,105L);
		ls.forEach(System.out::println);
		
		
		System.out.println("\n\nUsing LongStream inclusive upper:\n");
		LongStream ls1=LongStream.rangeClosed(100L,105L);
		ls1.forEach(System.out::println);
		
		
		System.out.println("\n\nDoubleStrem:\n");
		DoubleStream.of(1.4d, 2.2d, 3.1d)
		        .forEach(System.out::println);
		
		//--//doubleStream  && descending for intstream  home Work
		
		
		
		
		
		
		
		
	}

}
