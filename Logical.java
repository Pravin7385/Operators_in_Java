package com.operators;

// Logical Operators 

public class Logical {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 40;
		
		// Logical AND Operators(&&)
		System.out.println( x<y && x<z );
		
		// Logical OR Operators(||)
		System.out.println(x<y || x<z);
		
		//bitwise AND Operator(&)----->
		System.out.println(x<y & x<z);
		
		//bitwise OR Operator(|)----->
		System.out.println(x<y | x<z);
		
		
	}

}
