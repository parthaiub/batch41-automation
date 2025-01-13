package com.regression;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMNegativeLoginWrongpassword {
	
	
	
public static void main(String[] args) {
		
	
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	

}
