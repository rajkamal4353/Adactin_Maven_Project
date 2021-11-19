package com.Base_Class_Adactin_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class_October.Base_Class;

public class Adactin_Project_by_Base_Class extends Base_Class {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver = get_Driver("chrome");
		
		geturl("https://adactinhotelapp.com/");
		
		
		imwait(10);
		
		
		WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
		inputelement(user_name, "66668888");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		inputelement(password, "9876543210");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		click(login);
		
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		drop_down(location, "ByVisibleText", "Brisbane");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		drop_down(hotel, "ByIndex", "3");
		
		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		drop_down(room_type, "ByIndex","3");
		
		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		drop_down(room_nos, "ByIndex", "8");
		
		WebElement checkin_date = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		inputelement(checkin_date, "17/10/2021");
		
		WebElement checkout_date = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		inputelement(checkout_date, "18/10/2021");
		
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		drop_down(adult, "ByIndex", "3");
		
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		drop_down(child, "ByIndex", "3");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		click(search);
		
		
		WebElement select = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		click(select);
		
		WebElement contin = driver.findElement(By.xpath("//input[@id='continue']"));
		click(contin);
	
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		inputelement(first_name, "Rajkamal");
		
		WebElement last_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		inputelement(last_name, "Muniappan");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		inputelement(address, "6/88R,Batman road,Gotham City,Brisbane");
		
		WebElement cc_no = driver.findElement(By.xpath("//input[@id='cc_num']"));
		inputelement(cc_no, "8675432101234576");
		
		WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		drop_down(cc_type, "ByIndex", "3");
		
		WebElement exp_date = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		drop_down(exp_date, "ByIndex", "8");
		
		WebElement exp_yr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		drop_down(exp_yr, "ByIndex", "12");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		inputelement(cvv, "568");
		
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		click(book);
		
		
		imwait(10);
		
		WebElement iti = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		click(iti);
		
		
		screenshot("AH5.png");
		
		imwait(5);
		
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		click(logout);
		
		
		WebElement login_again = driver.findElement(By.xpath("//a[text()='Click here to login again']"));
		click(login_again);	
		
	}
}