package com.phoenix.optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.phoenix.models.Product;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Integer> op=Optional.empty();
		if(op.isPresent())
			System.out.println("non Empty");
		else
			System.out.println(" Empty");
		
		Optional<Integer> opi=Optional.of(100);
		
		if(opi.isPresent())
			System.out.println(opi.get());
		else
			System.out.println("Empty");
		
		Consumer<Integer> c=n-> System.out.println(n);
		opi.ifPresent(c);
		opi.ifPresent(n->System.out.println(n));
		
		Optional<String> ops=Optional.ofNullable("Hello");
		System.out.println(ops.get());
		
		System.out.println(op.orElse(200));
		System.out.println(opi.orElse(200));
		
		System.out.println(op.orElseGet(()->300));
		System.out.println(opi.orElseGet(()->300));
		
	    Supplier<Exception> s1=()->new Exception("No Value");
	    Exception e=s1.get();
	    
	    
	    //System.out.println(op.orElseThrow( ()->new ArithmeticException("Error")));
	    Optional<Product>opp=Optional.of
	    		(new Product(1001,"Laptop","HP",23000.0f));
	    
	    if(opp.isPresent())
	    	System.out.println(opp.get());
	    

}
}
