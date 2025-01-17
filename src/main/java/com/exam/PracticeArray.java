package com.exam;

import java.util.Arrays;

public class PracticeArray {
	


	public void getArray(){	
		
	int [] a= {7,8}; 
		System.out.println(Arrays.toString(a));// need Arrays.toString(Array name)
		
	}
	public static void getArray2(){
		
		int [] b= {7,8};
		System.out.println(Arrays.toString(b));
		
	}
	
	public static void main(String[] args) {
		
		PracticeArray obj = new PracticeArray   ();
		obj.getArray(); 
		PracticeArray.getArray2();
	}
}



