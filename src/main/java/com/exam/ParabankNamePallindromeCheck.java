package com.exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ParabankNamePallindromeCheck {

	String beforereverse="";
	
	public void getParabankPllindrome() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=9F0BB09CA1DC2D5618E8361F476518FD");
		
		
		String mytitle=driver.findElement(By.xpath("//*[@title='ParaBank']")).getAttribute("title");
		driver.manage().window().maximize();
		System.out.println("My Title=" + mytitle);
		
		
		System.out.println("Before reverse=" + mytitle);
		for(int i=mytitle.length()-1; i>=0;i--) {
		beforereverse=beforereverse+mytitle.charAt(i);	
			
		}
		System.out.println("After reverse=" +beforereverse);
		
		if (mytitle.equals(beforereverse)) {
			System.out.println("Parabank is pallindrome");
			
		}
		else {
			System.out.println("Parabank is not pallindrome");
			
		}
		
		
		//validation for automation 
		System.out.println("contion test =" +mytitle.equals(beforereverse));//Check contion true or false
		SoftAssert sf= new SoftAssert();
		sf.assertFalse(mytitle.equals(beforereverse));//when we know the condition 
		//sf.assertTrue(!mytitle.equals(beforereverse));//wehn we dont't condtion
		
		
		driver.quit();
		sf.assertAll();
	}
	
	
	
	
	public static void main(String[] args) {
	ParabankNamePallindromeCheck obj =new ParabankNamePallindromeCheck();
	obj.getParabankPllindrome();	
	}
}
