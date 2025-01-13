package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {
	
	
public void getColor(WebDriver driver, WebElement elem) {
	JavascriptExecutor obj =(JavascriptExecutor) driver;
	obj.executeScript("arguments[0].style.border='3px solid red'", elem);

}

public void getColor(WebDriver driver, WebElement elem,String colorName) {
	JavascriptExecutor obj =(JavascriptExecutor) driver;
	obj.executeScript("arguments[0].style.border='3px solid"+colorName+"'", elem);
}

}
