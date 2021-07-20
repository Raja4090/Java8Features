package com.pheonix.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.models.Product;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Product>prodList=new ArrayList<Product>();
		
		prodList.add(new Product(1001,"Laptop","HP ",35600.0f));
		prodList.add(new Product(1005,"Refrigerator","Whirlpool",38200.0f));
		prodList.add(new Product(1002,"Mobile","Vivo",17999.0f));
		prodList.add(new Product(1007,"Mobile","Samsung",23800.0f));
		prodList.add(new Product(1001,"LED TV","Sony",57000.0f));
		
		System.out.println("Sorting acc to Id: \n");
		Collections.sort(prodList);
		prodList.forEach(System.out::println);
		
		
		
		System.out.println("Sorting acc to Natural order: \n");
		prodList.sort(Comparator.naturalOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("Sorting acc to reverse order: \n");
		prodList.sort(Comparator.reverseOrder());
		prodList.forEach(System.out::println);
		
		System.out.println("\n\nSorting acc to Natural order using stream");
		prodList.stream().sorted()
		.forEach(System.out::println);
		
		
		System.out.println("\n\nSorting acc to reverse order using stream");
		prodList.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		
		//sorting acc to ascending order of prodName
		
		System.out.println("\n\nsorting acc to ascending order of prodName==>");
		prodList.sort(Comparator.comparing(Product::getName));	
		prodList.forEach(System.out::println);
       
		
		System.out.println("\n\nsorting acc to reversed order of prodName==>");
		prodList.sort(Comparator.comparing(Product::getName).reversed());	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to ascending order of BrandName==>");
		prodList.sort(Comparator.comparing(Product::getBrand));	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to reversed order of brandName==>");
		prodList.sort(Comparator.comparing(Product::getBrand).reversed());	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to ascending order of Price==>");
		prodList.sort(Comparator.comparing(Product::getPrice));	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to reversed order of Price==>");
		prodList.sort(Comparator.comparing(Product::getPrice).reversed());	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to Asc order of Name and Desc order of brand==>");
		prodList.sort(Comparator.comparing(Product::getName)
				.thenComparing(Product::getBrand,(b1,b2)->b1.compareTo(b2)));	
		prodList.forEach(System.out::println);
		
		
		System.out.println("\n\nsorting acc to Desc order of Name and Asc order of brand==>");
		prodList.sort(Comparator.comparing(Product::getName)
				.reversed()
				.thenComparing(Product::getBrand));	
		prodList.forEach(System.out::println);
		
		
		
		System.out.println("\n\nsorting acc to Desc order of Name and Desc order of brand==>");
		prodList.sort(Comparator.comparing(Product::getName)
				.thenComparing(Product::getBrand).reversed());	
		prodList.forEach(System.out::println);
		
		
		
		
		
		
       
	}

}
