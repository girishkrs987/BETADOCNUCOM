package Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PatientRegistrationPage;

public class PatientRegistrationTest extends TestBase{

	
	 LoginPage loginpage;
	 HomePage homepage;
	 PatientRegistrationPage Patient_reg;

	// define a constructor to call base class properties 
	
	 protected PatientRegistrationTest(){
		
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		intiliazation();
		// loginpage = new LoginPage();
	}
	
	/*@Test(priority=1)
	public void Verify_Adminstration_Menu() {
		
		loginpage.VerifyLogin(porp.getProperty("Username"),porp.getProperty("Password"));
		
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//homepage.Administration_Menu_Click();
	}
	*/
	@Test(priority=1)
	public 	void verifyPatientRegistration() {
		
		
				//String text=loginpage.verifymessage();	
				// Assert.assertEquals(text, "DOCTOR LOGIN");
		loginpage.VerifyLogin(porp.getProperty("Username"),porp.getProperty("Password"));
		Patient_reg.Patient_Registeration();
				
				
	}
}
