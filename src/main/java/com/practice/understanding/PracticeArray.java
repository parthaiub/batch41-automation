package com.practice.understanding;

import java.util.Arrays;

public class PracticeArray {
	
	
	public void getArray() {
		String [] name= {"partha", "Manisha", "Poku"};
		int [] salary= {90000, 80000,70000};
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(salary));
	}
	
	public void getArrayWithPerameter(int a) {
		
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		PracticeArray  obj = new PracticeArray();
		obj.getArray();
		obj.getArrayWithPerameter(19);
	}

}
