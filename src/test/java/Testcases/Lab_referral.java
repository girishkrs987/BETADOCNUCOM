package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;



public class Lab_referral extends LoginPage{
	 public static LoginPage login; 
	 
	 public WebDriver driver; 
	
	@BeforeMethod
	public static void setup() {
//		
	intiliazation(); 
	}
	
	
	//public static void main(String[] args) {
			
		@Test
		public static void login() {
			
			//login=new LoginPage();
			login.VerifyLogin("9964617093", "&CnyRg9q");
		}
		
		
		
		
	}
	


