package com.generic;

public class BasicJava {

	public  void getpartha() {
		
	// How to write variable
	//My name is partha
	String myname= "Partha";
	
	//My age is 33
	int age =33;
	
	//My password is 33paetha
	String password= "33paetha";
	
	System.out.println(myname);
	System.out.println(age);
	System.out.println(password);
	}

	
public static void main(String[] args) {
	
	int a=6;
	int b=6;
	
	int ab=(a+b);
	
	System.out.println(ab);
	//statc method so just write method name 
	//getpartha();
	
	//if not static method 
	BasicJava obj =new BasicJava();
	obj.getpartha();
	

}}
