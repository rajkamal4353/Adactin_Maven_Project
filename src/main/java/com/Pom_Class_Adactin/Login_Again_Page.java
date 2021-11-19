package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Again_Page {
	
    public WebDriver driver;        // ---> Null Driver
	
	@FindBy(xpath = "//a[text()='Click here to login again']")
    private WebElement login_again;
	
	
    public Login_Again_Page(WebDriver driver6) {
		
		this.driver = driver6;
			
		PageFactory.initElements(driver, this);
	}

    
    public WebElement getLogin_Again() {
        return login_again;
    }
}

