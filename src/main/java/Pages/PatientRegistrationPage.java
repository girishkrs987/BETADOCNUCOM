package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class PatientRegistrationPage extends TestBase {

	
	  WebDriver driver;
		
		
		// define page factory 
		 
		 @FindBy(xpath="//*[@id=\"navigation\"]/li[6]/a/span")
	    public static  WebElement Practice_Manager ;
		 
		//[contains(text(),'Practice Manager')]
		//*[@id="navigation"]/li[6]/a/span
		 @FindBy(xpath="//a[contains(text(),'Appointments')]")
	     WebElement Appointments_submnenu ;
		 
		 @FindBy(xpath="//a[contains(text(),'Patient Manager')]")
	     WebElement Patient_Manager_submnenu ;
		 
		 public PatientRegistrationPage() {
		    	
		    	intiliazation();
		    	driver=TestBase.driver;
		    	PageFactory.initElements(driver, this);
		    }
		 
		 
		public void Patient_Registeration() {
			Practice_Manager.click();
			Patient_Manager_submnenu.click();
		} 
}
