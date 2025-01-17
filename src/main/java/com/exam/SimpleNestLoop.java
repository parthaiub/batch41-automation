package com.exam;

public class SimpleNestLoop {
	
	public void getNestLoop(int num) {
		
	for(int i= 1; i <= 7; i++) {

		for(int j= 1; j <= i; j++){
		
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		SimpleNestLoop obj = new SimpleNestLoop ();
		obj.getNestLoop(0);
		
	}
}
