package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom_Class_Adactin.Book_Hotel_Page;
import com.Pom_Class_Adactin.Booked_Itinerary_Page;
import com.Pom_Class_Adactin.Booking_Confirmation_Page;
import com.Pom_Class_Adactin.Login_Again_Page;
import com.Pom_Class_Adactin.Search_Hotel_Page;
import com.Pom_Class_Adactin.Select_Hotel_Page;
import com.Pom_Class_Adactin.User_Login_Page;

public class Page_Object_Manager {
	
	
     public WebDriver driver;        //---> null driver
	
     
	  // private Class name Object name
     
     
     private User_Login_Page ulp;
     
     private Search_Hotel_Page shp;
     
     private Select_Hotel_Page slhp;
     
     private Book_Hotel_Page bhp;
     
     private Booking_Confirmation_Page bcp;
     
     private Booked_Itinerary_Page lgt;
     
     private Login_Again_Page lgag;
     
     
     public Page_Object_Manager(WebDriver driver) {
 		this.driver = driver;
 	 }
 	
     
     public User_Login_Page getInstanceUlp() {
 		ulp = new User_Login_Page(driver);
 		return ulp;
 	 }
     
     public Search_Hotel_Page getInstanceShp() {
  		shp = new Search_Hotel_Page(driver);
  		return shp;
  	 }
     
     public Select_Hotel_Page getInstanceSlhp() {
   		slhp = new Select_Hotel_Page(driver);
   		return slhp;
   	 }
     
     public Book_Hotel_Page getInstanceBhp() {
    		bhp = new Book_Hotel_Page(driver);
    		return bhp;
     }
     
     public Booking_Confirmation_Page getInstanceBcp() {
 		bcp = new Booking_Confirmation_Page(driver);
 		return bcp;
 	 }
     
     public Booked_Itinerary_Page getInstanceLgt() {
  		lgt = new Booked_Itinerary_Page(driver);
  		return lgt;
  	 }
     
     public Login_Again_Page getInstanceLgag() {
   		lgag = new Login_Again_Page(driver);
   		return lgag;
   	 }
     
}
