package com.exam;

public class VariableDeclare {

		int age1 = 1; // global also called instance 
		static int age2 = 2; // global also called static 

		public void getVaribale( int age3){	
		int age4= 4; // local 1
		
			System.out.println(age1);
			System.out.println(age2);
			System.out.println(age3);
			System.out.println(age4);
		
		}
		public static void getVaribale2(){
			//System.out.println(age1);//not possible only handle static 
			//System.out.println(age3);//not possible other not same method 
			System.out.println(age2);
			//System.out.println(age4);//not possible other not same method 
		}
		
		public static void main(String[] args) {
			
			VariableDeclare  obj =new  VariableDeclare  ();
			obj.getVaribale(3); // 7 is i
			VariableDeclare.getVaribale2();// need declare //Static method call mainclass name. static method name 
		}
}
