package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
	
	public WebDriver driver;        // ---> Null Driver
	
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
    private WebElement radio_btn;
	
	@FindBy(xpath = "//input[@id='continue']")
    private WebElement contin;
	
	
	public Select_Hotel_Page(WebDriver driver2) {
			
		this.driver = driver2;
			
		PageFactory.initElements(driver, this);
	}
	 
	
	public WebElement getRadio() {
		return radio_btn;
	}
	
	public WebElement getContinue() {
		return contin;
	}
}
