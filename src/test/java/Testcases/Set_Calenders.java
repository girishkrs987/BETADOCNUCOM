package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class Set_Calenders extends TestBase{

	 LoginPage loginpage;
	 HomePage homepage;

	// define a constructor to call base class properties 
	
	 Set_Calenders(){
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		//intiliazation();
		loginpage = new LoginPage();
	}
	
	@Test(priority=1)
	public void Verify_Adminstration_Menu() {
		
		loginpage.VerifyLogin(porp.getProperty("Username"),porp.getProperty("Password"));
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		homepage.Administration_Menu_Click();
	}
}
