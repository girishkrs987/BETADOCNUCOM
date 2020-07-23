package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends TestBase{
	
	 LoginPage loginpage;
	 HomePage homepage;

	// define a constructor to call base class properties 
	
	LoginTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		//intiliazation();
		 loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public 	void verifylogintext() {
		
		
				String text=loginpage.verifymessage();	
				Assert.assertEquals(text, "DOCTOR LOGIN");
				
				
	}
	

@Test(priority=2)
public 	void VerifyloginTest() {
	
	
	homepage= loginpage.VerifyLogin(porp.getProperty("Username"),porp.getProperty("Password"));
	
	//System.out.println(message);
}
	
@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	

}
