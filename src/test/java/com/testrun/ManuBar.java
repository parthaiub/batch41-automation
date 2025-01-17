package com.testrun;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManuBar {
	

	public static void main(String[] args) {
	WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.costco.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	List<WebElement> manubar =driver.findElements(By.xpath("//*[@class='MuiBox-root mui-1nzpdry']//a"));
	
	System.out.println("Manu bar total name="+manubar.size());
	
	for(int i=0; i<manubar.size();i++) {
		
		System.out.println(manubar.get(i).getText());
	}
	
	
	}}

