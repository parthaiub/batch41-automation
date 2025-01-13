package com.generic;

public class PracticeForLoop {

	
	//Positive loop
	public void getForLoopPositive(){
	for(int i=1; i<=22;i++) {
		
		System.out.println(i);
		}
	}
	//Negative loop
		public void getForLoopNegatice(){
		for(int i=10; i>=0;i--) {
			
			System.out.println(i);
			}
		}
	
		//String  country USA
	
		public void getForLoopString(){
		String country="USA";
		for(int i=0; i<country.length();i++) {
			
			System.out.println(country.charAt(i));
			} 
		}
		
		
		
	public static void main(String[] args) {
		
		PracticeForLoop  practiceForLoop = new PracticeForLoop ();
		
		practiceForLoop.getForLoopPositive();
		practiceForLoop.getForLoopNegatice();
		practiceForLoop.getForLoopString();
	
		
	}
}
