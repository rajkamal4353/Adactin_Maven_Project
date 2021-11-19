package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	

	public WebDriver driver;        // ---> Null Driver
	
	
	@FindBy(xpath = "//select[@id='location']")
    private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
    private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
    private WebElement room_type;
	
	@FindBy(xpath = "//select[@id='room_nos']")
    private WebElement room_nos;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
    private WebElement check_in;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
    private WebElement check_out;
	
	@FindBy(xpath = "//select[@id='adult_room']")
    private WebElement adult_room;
	
	@FindBy(xpath = "//select[@id='child_room']")
    private WebElement child_room;
	
	@FindBy(xpath = "//input[@id='Submit']")
    private WebElement submit;
	
	
    public Search_Hotel_Page(WebDriver driver1) {
		
		this.driver = driver1;
		
		PageFactory.initElements(driver, this);
	}
    
    
    public WebElement getLocation() {
		return location;
	}
    
    public WebElement getHotels() {
		return hotels;
	}
    
    public WebElement getRoom_Type() {
		return room_type;
	}
    
    public WebElement getRoom_Nos() {
		return room_nos;
	}
    
    public WebElement getCheck_In() {
		return check_in;
	}
    
    public WebElement getCheck_Out() {
		return check_out;
	}
    
    public WebElement getAdult_Room() {
		return adult_room;
	}
    
    public WebElement getChild_Room() {
		return child_room;
	}
    
    public WebElement getSubmit() {
		return submit;
	}
    
}
