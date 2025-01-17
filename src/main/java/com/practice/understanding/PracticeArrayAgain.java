
package com.practice.understanding;


public class PracticeArrayAgain {
	
	//2 dimension  Array with multiple values 
	
	public void getArrays(String [] name, String [] password) {
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(password[0]);
	System.out.println(password[1]);
			
		}
	public static void main(String[] args) {
	String [] name = {"Partha","Manisha"}; 
	String [] password = {"777777","6666666"};// 2 dimension array
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays(name,password);
}}


/*


package com.practice.understanding;

import java.util.Arrays;

public class PracticeArrayAgain {
	
	//2 dimension  Array with multiple values 
	
	public void getArrays(String [] [] a ) {
	System.out.println(a[0][0]);
	System.out.println(a[0][1]);
	System.out.println(a[1][0]);
	System.out.println(a[1][1]);
	
	//System.out.println(a[1][1])0
			
		}
	public static void main(String[] args) {
		String [] [] a = {{"Partha","7777777"}, {"manisha","6666666"}};// 2 dimension array
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays(a);
}}


*/


/*

package com.practice.understanding;

public class PracticeArrayAgain {
	
	//Use for loop
	
	public void getArrays(int [] a ) {
		
		
		//System.out.println("Print just a single value="+ a[0]);
		//System.out.println(Arrays.toString(a));// this for print whole array 
		
		for(int i=0; i<a.length; i++ ) {
			System.out.println(a[i]);//This for print single value of array 
			
		}}
	public static void main(String[] args) {
		int [] a = {44,77,99};
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays(a);
}}

*/

/*
 
package com.practice.understanding;

import java.util.Arrays;

public class PracticeArrayAgain {
	
	//how to declare array 
	
	public void getArrays() {
		int [] a = {44,77,99};
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays();
}}

*/



/*

package com.practice.understanding;

import java.util.Arrays;


//how to declare array with parameter
public class PracticeArrayAgain {
	
	
	public void getArrays(int [] a) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
	int [] a = {44,77,99};
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays(a);
}}
*/


/*

package com.practice.understanding;

import java.util.Arrays;

public class PracticeArrayAgain {
	
	
	public void getArrays(int [] a) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		
	int [] a = {44,77,99};
	PracticeArrayAgain obj =new  PracticeArrayAgain();
	obj.getArrays(a);
}}
*/