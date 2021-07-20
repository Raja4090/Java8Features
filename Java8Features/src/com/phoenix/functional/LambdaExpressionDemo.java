package com.phoenix.functional;
//author: raja.kumar@stltech.in

public class LambdaExpressionDemo {

	public static void doMath(Addable ob)
	{
		System.out.println("Result is: "+ob.add(10,30));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable m=()->System.out.println("Anonymous object moves");
		m.move();
		Jumpable j=()->System.out.println("Anonymous object jumpes");
		j.jump();
		
		Addable a=(x,y)->{return x+y;};
		System.out.println("Sum is: "+a.add(10, 20));
		
		Greeting g=name -> "Hello "+name;
		System.out.println(g.greet("Raja !"));
	    
		doMath((c,d)->c+d);
		
		//calling default method
		float res=a.addFloats(2.5f, 4.90f);
		System.out.println("Result is: "+res);
		
		//calling static method
		Addable.show();
		
	}

}
