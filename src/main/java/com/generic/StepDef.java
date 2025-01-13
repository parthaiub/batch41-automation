package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlight;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	Highlight hl; 
	
	//Full object creation 
	//SeleniumPageFactory pf =new SeleniumPageFactory();
	
	
	// object creation another 
	SeleniumPageFactory pf;
	WebDriver driver;
	
	

	@Given("open browser")
	public void open_browser() {
		
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	
	
	
	@Given("Go to application login page")
	public void go_to_application_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	}

	@When("write valid username in user field")
	public void write_valid_username_in_user_field() {
		
		hl =new Highlight();
		hl.getColor(driver, pf.getUsername());
		pf =new SeleniumPageFactory();
		pf.getUsername();
		
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	}

	@When("write valid password in password field")
	public void write_valid_password_in_password_field() {
		
		hl.getColor(driver, pf.getPassword(), "black");//lower letter
		pf.getPassword();
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("");
	}

	@When("Click login button")
	public void click_login_button() {
		hl.getColor(driver, pf.getLoginBtd(), "yellow");
		pf.getLoginBtd();
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("check login status should pass")
	public void check_login_status_should_pass() {
	   
	}

	@When("write invalid username in user field")
	public void write_invalid_username_in_user_field() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("WrongeUsername");
	}

	@When("write invalid password in password field")
	public void write_invalid_password_in_password_field() {
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("12345");
	}

	@Then("check login status should fail")
	public void check_login_status_should_fail() {
	    
	}

	@When("write null username in user field")
	public void write_null_username_in_user_field() {
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("WrongeUsername");
	}

	@When("write null password in password field")
	public void write_null_password_in_password_field() {
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("");
	}


}
