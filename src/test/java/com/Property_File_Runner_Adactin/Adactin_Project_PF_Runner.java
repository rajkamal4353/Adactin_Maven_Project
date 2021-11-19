package com.Property_File_Runner_Adactin;

import org.openqa.selenium.WebDriver;

import com.Base_Class_October.Base_Class;
import com.Sdp.Page_Object_Manager;
import com.configuration.helper.File_Reader_Manager_Adactin;

public class Adactin_Project_PF_Runner extends Base_Class {
	

	public static WebDriver driver = Base_Class.get_Driver("chrome");  // ---> null
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
//		geturl("https://adactinhotelapp.com/");
		
		String url = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getUrl();
		geturl(url);
		
		
//-Login_Page		
		
		
		imwait(10);
		
		String username = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getUsername();
		inputelement(pom.getInstanceUlp().getUsername(),username);
		
		String password = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getPassword();
		inputelement(pom.getInstanceUlp().getPassword(),password);
		
		click(pom.getInstanceUlp().getLogin_Btn());
		
		
//-Search_Hotel_Page		
		
		
		drop_down(pom.getInstanceShp().getLocation(),"ByVisibleText", "Brisbane");
		
		drop_down(pom.getInstanceShp().getHotels(),"ByIndex", "3");
		
		drop_down(pom.getInstanceShp().getRoom_Type(),"ByIndex","3");
		
		drop_down(pom.getInstanceShp().getRoom_Nos(),"ByIndex", "8");
		
		inputelement(pom.getInstanceShp().getCheck_In(),"17/10/2021");
		
		inputelement(pom.getInstanceShp().getCheck_Out(),"18/10/2021");
		
		drop_down(pom.getInstanceShp().getAdult_Room(),"ByIndex", "3");
		
	    drop_down(pom.getInstanceShp().getChild_Room(),"ByIndex", "3");
		
		click(pom.getInstanceShp().getSubmit());
		
		
//-Select_Hotel_Page			
		
		
		click(pom.getInstanceSlhp().getRadio());
		
		click(pom.getInstanceSlhp().getContinue());
		
		
//-Book_Hotel_Page	
		
		
		inputelement(pom.getInstanceBhp().getFirst_Name(),"Rajkamal");
		
		inputelement(pom.getInstanceBhp().getLast_Name(),"Muniappan");
		
		inputelement(pom.getInstanceBhp().getAddress(),"6/88R,Batman road,Gotham City,Brisbane");
		
		String CreditCardNo = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getCreditCardNo();
		inputelement(pom.getInstanceBhp().getCC_Num(),CreditCardNo);
		
		drop_down(pom.getInstanceBhp().getCC_Type(),"ByIndex", "3");
		
		drop_down(pom.getInstanceBhp().getCC_Expm(),"ByIndex", "8");
		
		drop_down(pom.getInstanceBhp().getCC_Expy(),"ByIndex", "12");
		
		String Cvv = File_Reader_Manager_Adactin.getInstanceFRM().getInstanceCR().getCvv();
		inputelement(pom.getInstanceBhp().getCC_Cvv(),Cvv);
		
		click(pom.getInstanceBhp().getBook_Now());
		
		
//-Booking_Confirmation_Page		
		
		
		imwait(10);
		
		click(pom.getInstanceBcp().getMy_Itinerary());
		

//-Booked_Itinerary_Page
		
		
		screenshot("AH8.png");
		
		imwait(5);
		
		click(pom.getInstanceLgt().getLogout());
		
		
//-Login_Again_Page		
		
		
		click(pom.getInstanceLgag().getLogin_Again());
		
	}
}
