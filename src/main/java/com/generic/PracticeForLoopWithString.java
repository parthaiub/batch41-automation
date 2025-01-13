package com.generic;

public class PracticeForLoopWithString {
	 
	
	String Name="Partha";
	String name ="mom";
	String reverse="";
	public void getloopPos(){
		
		
		for(int i=0;i<Name.length(); i++) {
		System.out.println(Name.charAt(i));
			
		}
	}
	//Reverse loop 
	public void getLoopNeg(){
		
		for ( int i=Name.length()-1; i>=0; i-- ) {
		System.out.println(Name.charAt(i));
			
			
		}
	}
	
	
	
	//How to reverse mom
	
	public void getmom() {
		
		System.out.println("Before reverse= " + name);
		for ( int i=name.length()-1; i>=0;i--) {
		//System.err.println(name.charAt(i));
		reverse=reverse+name.charAt(i);
	}
		
	System.out.println("After reverse= " + reverse);
	
	
	
	if( name.equals(reverse)){
		System.out.println("Mom is pallindrome");
		}
	
	else {
		System.out.println("Mom is not pallindrome");
	}
	}
	
	//Reverse loop 
	public static void main(String[] args) {
		
		PracticeForLoopWithString nothing = new PracticeForLoopWithString ();
		nothing.getloopPos();
		nothing.getLoopNeg();
		nothing.getmom();
	}
	

}
