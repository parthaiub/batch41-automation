package com.regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
 void positiveLoginTest(){
	 
	 
	 
	 // selenium stage 
	 //how to open driver 
	 WebDriver driver= new ChromeDriver();
	 
	 //How to go application URL
	 driver.get(null);
	 
	 //How to write user
	 driver.findElement(By.xpath("Locator")).sendKeys("User");
	 
	 //How to input password
	 driver.findElement(By.xpath("Locator")).sendKeys("Password");
	 
	 //How To click Loginbutton 
	 
	 driver.findElement(By.className("Locator")).click();
	 

}
}
