package com.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPageFactory {
//Java Encapsulation =private+ getter method
	//Selenium PF=@Findby
	
	@FindBy(xpath="//*[@name='username']")
	private WebElement username;
	@FindBy(xpath="/*[@type='password']")
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginBtd;

	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtd() {
		return loginBtd;
	}

}
 