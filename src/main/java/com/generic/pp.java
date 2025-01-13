package com.generic;

public class pp {
	
	public void getnumber() {
		
	int a= 10;
	int b=20;
	
	System.out.println("a value=" + a);
	System.out.println("b value= "+ b);
	
	
	//swap value
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value=" + a);
	System.out.println("b value= "+ b);

	}
	public static void main(String[] args) {
		pp obj =new pp();
		obj.getnumber();
	} 

}
