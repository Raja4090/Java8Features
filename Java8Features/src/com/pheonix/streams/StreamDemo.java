package com.pheonix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

public class StreamDemo {

	public static void main(String[] args) {
		List<Product>prodList=new ArrayList<Product>();
		
		prodList.add(new Product(1001,"Laptop","HP ",35600.0f));
		prodList.add(new Product(1005,"Refrigerator","Whirlpool",38200.0f));
		prodList.add(new Product(1002,"Mobile","Vivo",17999.0f));
		prodList.add(new Product(1007,"Mobile","Samsung",23800.0f));
		prodList.add(new Product(1001,"LED TV","Sony",57000.0f));
		
		Stream<Product> prodStream=prodList.stream();
		Stream<Product> filteredStream=prodStream.filter(p->p.getPrice()>20000.0f);
		
		List<Product> filteredProdList=  filteredStream.collect(Collectors.toList());
		
		System.out.println("Filtered the result,greater thean 20000==>\n");
		filteredProdList.forEach(p->System.out.println(p));
		
		
		//stream pipeline
		
		System.out.println("\n\nFiltered the result using Pipeline,greater thean 20000==>\n");
		List<Product> products=prodList.stream().
				filter(p->p.getPrice()>20000.0f)//intermediate
				.collect(Collectors.toList()); //terminal
		
		products.forEach(System.out::println);
		
		System.out.println("Fetching record of Prices>20000===>");
		List<Float> prodPrices=prodList.stream()
				.filter(p-> p.getPrice()>20000.0f)
				.map(product->product.getPrice())
				.collect(Collectors.toList());
		
		prodPrices.forEach(System.out::println);
		
		
        long prodCount=prodList.stream()
        		.count();
        System.out.println("No. of products prices: "+prodCount);
        
        Product prodMaxPrice= prodList.stream()
        		               .max((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
                               .get();
	
        
        System.out.println("Max Price: "+prodMaxPrice);
        
        
        Product prodMinPrice= prodList.stream()
	               .min((p1,p2)->p1.getPrice()>p2.getPrice()?1:-1)
                .get();
        
        
        System.out.println("Min Price: "+prodMinPrice);
        
        
        float maxPrice= prodList.stream()
        		   .map(p->p.getPrice())
        		   .max((price1,price2)->price1>price2?1:-1 )
        		   .get();
      
        
        System.out.println("Max price: "+maxPrice);
        
        

        float minPrice= prodList.stream()
     		   .map(p->p.getPrice())
     		   .min((price1,price2)->price1>price2?1:-1 )
     		   .get();
   
     
        System.out.println("Min price: "+minPrice);
     
     

        
        
        
	}

}
