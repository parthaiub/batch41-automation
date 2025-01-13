package com.generic;

public class HowToVariableSplit {

	public static void main(String[] args) {
		
	
		
		String user = "Row2_Col1";
		
		String row = user.split("_")[0];//break with _
		String actualRowNumber =row.replace("Row", "");
		int rowNo=Integer.parseInt(actualRowNumber);
		
		String col = user.split("_")[1];
		String actualColNumber =row.replace("Col", "");
		int colNo=Integer.parseInt(actualColNumber);
		
	
		System.out.println("Actula row number int=" +rowNo);
		System.out.println("Actula row number int=" +colNo);
	}} 
	

