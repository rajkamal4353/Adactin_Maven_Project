package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	
	public WebDriver driver;        // ---> Null Driver
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
    private WebElement my_ity;
	
	
    public Booking_Confirmation_Page(WebDriver driver4) {
		
		this.driver = driver4;
			
		PageFactory.initElements(driver, this);
	}
    
    
    public WebElement getMy_Itinerary() {
	    return my_ity;
    }
}
