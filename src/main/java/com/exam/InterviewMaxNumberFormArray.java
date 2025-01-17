package com.exam;

import java.util.Arrays;

public class InterviewMaxNumberFormArray {
	
	//Find max value form a={1,2,3,4,5,6,7};
	
	
	public static void main(String[] args) {
		
	int []	a = {7,5,3,1004,5,6,7};
	Arrays.sort(a);//need to sorting
	
	int maxValue= a[0];//max value
	int secondMaxValue =a[0]; //2nd max value
	int thirdMaxValue =a[0];// third max value
	for(int i=0; i<a.length; i++) {
		
	System.out.println("Each Number = " + a[i]);
	
	if(a[i]>maxValue) {
		
		thirdMaxValue=secondMaxValue;
		secondMaxValue=maxValue;
		maxValue=a[i]; 
	}	
}	
	System.out.println("Max Number is =" +maxValue);
	System.out.println("Second max Number is =" +secondMaxValue);
	System.out.println("Third max number  is =" +thirdMaxValue);
	}

}
