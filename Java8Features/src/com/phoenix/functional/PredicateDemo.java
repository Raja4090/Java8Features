package com.phoenix.functional;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.phoenix.models.Product;

public class PredicateDemo {
	
	public static void main(String[]args)
	{
		Predicate<Integer> p=n1->n1>10;
		boolean res=p.test(12);
		
		System.out.println(res);
		Predicate<String> p1=s->s.equals("Raja");
		System.out.println(p1.test("Raja"));
		System.out.println(p1.test("Rahul"));
		
		
		Consumer<String>c1=s->System.out.println(s);
		c1.accept("Welcome to functional Interface");
		
		Consumer<Integer>c2=s->System.out.println(s);
		c2.accept(100);
		
		Supplier<Double> s1=()->12.5;
		System.out.println(s1.get());
		
		Supplier<String> s2=()->"Hello Kumar!";
		System.out.println(s2.get());
		
		Supplier<ArrayList<Integer>>s3=ArrayList::new;
		ArrayList<Integer>numList=s3.get();
		System.out.println("Size of ArrayList: "+numList.size());
				
		Consumer<Integer> c4= a->numList.add(a);
		c4.accept(200);
		c4.accept(200);
		c4.accept(200);
		c4.accept(200);
		System.out.println("Size of ArrayList: "+numList.size());
		
		
		Function<String,Integer> f1=s->Integer.valueOf(s);
		System.out.println(f1.apply("65"));
		
		Supplier<Product> s5=()->new Product(1703,"Laptop","HP",29000.45f);
		Product pob=s5.get();
		
		
		Consumer<Product> c6=pob1->System.out.println(pob1);
		c6.accept(pob);
		
		
		Function<Product,Float>f7=product->product.getPrice();
		System.out.println(f7.apply(pob));
		
		Function<Product,String>f8=product->product.getBrand();
		System.out.println(f8.apply(pob));
		
		
		BiPredicate<Integer,Double> bp1=(i,d)->i>=d;
		System.out.println(bp1.test(123,123.0));
		System.out.println(bp1.test(123,34.0));
		System.out.println(bp1.test(123,340.0));
		
		
		BiConsumer<Integer,String> bc1=(n,s)-> System.out.println(n+"\t"+s);
		bc1.accept(100, "Hello");
		bc1.accept(pob.getId(), pob.getBrand());
		
		
		
		BiFunction<String,Integer,Boolean>bof1=(s,n)->s.equals(n);
		System.out.println(bof1.apply("100",100));
		
		BiFunction<String,Integer,Boolean>bof2=(s,n)->n==Integer.parseInt(s);
		System.out.println(bof2.apply("100",100));
		
		
		UnaryOperator<String> up=s->s.toUpperCase();
		System.out.println(up.apply("raja"));
		System.out.println(up.apply(pob.getBrand()));
		System.out.println(up.apply(pob.getName()));
		
		BinaryOperator<String> up1=(ss1,ss2)->ss1.concat(ss2);
		System.out.println(up1.apply("Raja ", " Kumar Jha"));
		
	}

}
