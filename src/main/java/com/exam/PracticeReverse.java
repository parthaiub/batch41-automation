package com.exam;

public class PracticeReverse {
	
	
	// Reverse Partha word with =out any predefine method ?
	
	
	String name="Partha";
	
	public void getReverse() {
		
		for (int i=name.length()-1; i>=0; i--) {
			System.out.println(name.charAt(i));	
		}
	}
	
	public static void main(String[] args) {
		 PracticeReverse obj = new  PracticeReverse();
		obj.getReverse();
		
	}
	
	
}
