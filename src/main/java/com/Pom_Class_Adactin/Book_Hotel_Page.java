package com.Pom_Class_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Page {
	
	
	public WebDriver driver;        // ---> Null Driver
	
	
	@FindBy(xpath = "//input[@id='first_name']")
    private WebElement first_name;
	
	@FindBy(xpath = "//input[@id='last_name']")
    private WebElement last_name;
	
	@FindBy(xpath = "//textarea[@id='address']")
    private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
    private WebElement cc_num;
	
	@FindBy(xpath = "//select[@id='cc_type']")
    private WebElement cc_type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
    private WebElement cc_expm;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
    private WebElement cc_expy;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
    private WebElement cc_cvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
    private WebElement book_now;
	
	
	public Book_Hotel_Page(WebDriver driver3) {
		
		this.driver = driver3;
			
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirst_Name() {
		return first_name;
	}
	
	public WebElement getLast_Name() {
		return last_name;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCC_Num() {
		return cc_num;
	}
	
	public WebElement getCC_Type() {
		return cc_type;
	}
	
	public WebElement getCC_Expm() {
		return cc_expm;
	}
	
	public WebElement getCC_Expy() {
		return cc_expy;
	}
	
	public WebElement getCC_Cvv() {
		return cc_cvv;
	}
	
	public WebElement getBook_Now() {
		return book_now;
	}

}
