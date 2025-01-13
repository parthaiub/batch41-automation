package com.exam;

public class PracticePallindromeWithForLoop {
	
	
	// Write mom word in reverse withput any predefine method 
	//Check is not pallindrome ?
	
	
	String beforereverse ="mom";
	String afterreverse="";
	public void getreversemom() {
		
		System.out.println("Before reverse="+ beforereverse);
		for( int i=beforereverse.length()-1; i>=0; i-- ){
			
		//System.out.println(name.charAt(i));
			afterreverse=afterreverse+beforereverse.charAt(i);
		
		}
		
		System.out.println("After reverse =" +afterreverse);
		
		
		if (beforereverse.equals(afterreverse)) {
			
			System.out.println("mom is pallindrome");
			}
		
		else {
			System.out.println("mom is not pallindrome");
			
		}}
	
	
	
	
public static void main(String[] args) {
	
	PracticePallindromeWithForLoop obj= new PracticePallindromeWithForLoop();
	obj.getreversemom();
	
}
}
