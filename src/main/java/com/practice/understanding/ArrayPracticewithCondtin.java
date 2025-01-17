package com.practice.understanding;

public class ArrayPracticewithCondtin {
	
	
	public void getArrayWithCondition( int[] a) {
		
		int maxvalue=a[0];
		for( int i=0; i<a.length;i++ ) {
			
			//System.out.println(a[i]);
			
			
			if(a[i]>maxvalue) {
				
			maxvalue=a[i]; 
			}
			
			
		}
		
		System.out.println(maxvalue);
		
		
	}
	

}
