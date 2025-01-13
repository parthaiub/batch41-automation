package com.encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPractice {
	
	//Contractors for connect driver
	public PageFactoryPractice (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	
	//Login 
	@FindBy(xpath="//*[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginButton;
	
	

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

	
	//Logout

	//Dashboard
	//Product
	//Payment
	
	
}
