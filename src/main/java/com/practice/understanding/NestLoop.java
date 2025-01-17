package com.practice.understanding;

public class NestLoop {
	
	//interview question ?
	//print * ** *** ****

public void getNestLoop( int num) {
		
			for( int i=1; i<=num;i++) {
			
			for(int j=1; j<=i;j++) { 
			System.out.print("*");
				
		}
			System.out.println("");
	}
}
public static void main(String[] args) {
	NestLoop  obj =new NestLoop ();
	obj.getNestLoop(6);
}
}
