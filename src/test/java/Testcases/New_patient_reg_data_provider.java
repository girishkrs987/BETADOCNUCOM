package Testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PatientRegistrationPage;
import Utility.Testutil;

public class New_patient_reg_data_provider extends TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		intiliazation();
		
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Monitha@@987");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
		//login=new LoginPage();
	}
//	
//	@BeforeMethod(enabled=false)
//	public void login() {
//		
//		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//		// Thread.sleep(2000);
//		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
//		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Growth@124");
//		/// Thread.sleep(2000);
//		 driver.findElement(By.id("DoctorLogin")).click();
//		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//	}
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		
		
		ArrayList<Object[]>  testdata=Testutil.getDataFromExcel();
				
		return testdata.iterator();
		
		
	}
	
	@Test(dataProvider="getTestData")
	public void patient_reg(String Prefix, String Firstname, String Gender, String Age, String Mobile, String City) {
	
		
//		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//			// Thread.sleep(2000);
//			 driver.findElement(By.id("UserName")).sendKeys("9972921986");
//			 driver.findElement(By.id("DocLoginpassword")).sendKeys("Growth@124");
//			/// Thread.sleep(2000);
//			 driver.findElement(By.id("DoctorLogin")).click();
//			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("<span>Practice Manager</span>")).click();
			 driver.findElement(By.xpath("<a href=\'/PatientManagerSearch/PatientSearch\'><i class=\'fa fa-angle-right\'></i>Patient Manager</a>")).click();	 
			 driver.findElement(By.xpath("//*[@id=\'content\']/div/div[3]/div/section/div[1]/a")).click();	 
			 
			 Select list = new Select ((WebElement) driver.findElements(By.xpath("//*[@id=\"Prefix\"]")));
			 list.selectByVisibleText(Prefix);
			 
			 
			 driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(Firstname);
			 
			//input[@id='Gender' and @value='1']  // gender options 1-male, 2-female, 3-3rd gender
			 
			 String Beforexpath="//input[@id='Gender' and @value='";
			 String Afeterxpath="']";
			 String Value =Gender;
			 
			 driver.findElement(By.xpath(Beforexpath+Value+Afeterxpath)).click();
			 
			 
			 driver.findElement(By.xpath("//*[@id=\'PatientAge\']")).sendKeys(Age);
			 driver.findElement(By.xpath("//*[@id=\'MobileNo\']")).sendKeys(Mobile);
			 driver.findElement(By.xpath("//*[@id=\"chkbxMobile\"]")).click();
			 Select city=new Select ((WebElement) driver.findElements(By.xpath("//*[@id=\'City\']")));
			 city.selectByVisibleText(City);
			 
			 driver.findElement(By.xpath("//*[@id=\"BtnAppointment\"]")).click();
			
			 
			//*[@id="Prefix"]
			//input[@id='Gender' and @value='1']
//		//homepage=
//				
//				login.VerifyLogin("9972921986", "Growth@123");
//				
//		
//		//LoginPage.VerifyLogin(un, pwd)
	}
	
//	@Test
//	public  void menulink() throws InterruptedException {
//		login.VerifyLogin("9972921986", "Growth@124");
//		
//		Thread.sleep(3000);
//		//patient=new PatientRegistrationPage();
//		//patient.Patient_Registeration();
//		
//		PatientRegistrationPage.Practice_Manager.click();
//	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
