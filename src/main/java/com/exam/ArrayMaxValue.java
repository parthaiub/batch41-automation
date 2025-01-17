package com.exam;

public class ArrayMaxValue {
	
	
	
	
	public static void main(String[] args) {
		
		
		int [] myArray = {1,2,3,4,89};
		int maxValue=myArray[0];
		int secondMaxValue=myArray[0];
		int thirdMaxValue=myArray[0];
		for(int i=0; i<myArray.length; i++) {
		System.out.println("Each number" + " "+ myArray[i]);
		
		if(myArray[i]>maxValue) {
			thirdMaxValue=secondMaxValue;
			secondMaxValue=maxValue;
			maxValue=myArray[i];
		}	
		}
		System.out.println("Max value is = "+ " "+ maxValue);
		System.out.println("Second value is = "+ " "+ secondMaxValue);
		System.out.println("Sthird value is = "+ " "+ thirdMaxValue);
	
	}

}
