package com.stringtest;

public class StringTest {
	int a;
	public static void main(String[] args) {
		String one="one";
		String two="two";
		String One=new String(one);
		String Two=two;

		if(one==One)
		System.out.println("Java is fun!");
		if(one.equals(One)==true)
		System.out.println("Programming needs practice.");
		if(one==Two)
		System.out.println("OOP is the way!");
		if(two.equals(Two)==true)
		System.out.println("Explore the world of Java.");
		
		
		int i;
		for(i=1;i<=4;i=i+3);
		System.out.println(i);
		
		
		/*a=10;
		int b=20;

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/
		
		System.out.println( Math.ceil(-99.9));
		
		int a = 4, b = 8, c = -5;

		System.out.println(a/b+"\n"+(++c*b--)+" "+a--*b/c--);
	}

}
