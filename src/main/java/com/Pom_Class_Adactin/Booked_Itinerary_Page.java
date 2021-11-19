package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary_Page {
	
	public WebDriver driver;        // ---> Null Driver
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement logout;
	
	
    public Booked_Itinerary_Page(WebDriver driver5) {
		
		this.driver = driver5;
			
		PageFactory.initElements(driver, this);
	}

    
    public WebElement getLogout() {
        return logout;
    }
}
