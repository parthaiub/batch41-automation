package com.generic;

public class BasicJavaWithMyBio {
	
	//non static method
	public void getManisha() {
		
		//note () doesn't matter 
		String Name= "Manisha Das Chaity";
		int phone=6905695;
		
		
		//Note: Just print Name if you use "" code
		System.out.println("Name");
		
		System.out.println(Name);
		System.out.println(phone);
	}
	
	//Static method 
	public static void getAddress() {
		
		
	String	HomeAdress= "440 clay road";
	String City ="Rochester";
	int zipecode =146243;
	
	System.out.println(HomeAdress);
	System.out.println(City );
	System.out.println(zipecode);
	
	}
	
public static void main(String[] args) {
	System.out.println("Manisha is 4th year Phd student");
	
	BasicJavaWithMyBio obj= new BasicJavaWithMyBio();
	obj.getManisha();
	getAddress();
}
}
