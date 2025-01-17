package com.practice.understanding;

public class ForLoopWithmethodParameter {
	
	
	
	public void getforLooppos(String name) {
		
		for( int i=0; i<name.length(); i++) {
			System.out.println(name.charAt(i));
		}
	}
	
	
public void getforLoopneg(String namereverse) {
		
		for( int i=namereverse.length()-1; i>=0; i--) {
			System.out.println(namereverse.charAt(i));
		}
	}
	public static void main(String[] args) {
		ForLoopWithmethodParameter  obj =new ForLoopWithmethodParameter ();
		obj.getforLooppos("partha");
		obj.getforLoopneg("partha");
	}
}
