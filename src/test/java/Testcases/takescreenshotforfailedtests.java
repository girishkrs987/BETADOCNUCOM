package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.baseclass1;
import Utility.Clisteners;
import Utility.Xls_Reader;
import junit.framework.Assert;


@Listeners(Clisteners.class)


public class takescreenshotforfailedtests extends baseclass1 {
	
	public   WebDriver driver ;
	
	@BeforeMethod
	public void setup() {
		
		baseclass1.intilaiztion();
	}
	
	
	
	
	@Test(priority=1,enabled=true)
	public  void verifylogin() {
		
//		//logger=extent.startTest("verifylogin"); 
//		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//			// Thread.sleep(2000);
//			 driver.findElement(By.id("UserName")).sendKeys("9972921986");
//			 driver.findElement(By.id("DocLoginpassword")).sendKeys("KRs117743");
//			/// Thread.sleep(2000);
//			 driver.findElement(By.id("DoctorLogin")).click();
//			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			 
//			 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
//				//Thread.sleep(2000);
//				driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']123")).click(); // clcik my referrals ubmneu 

		Assert.assertEquals(false, true);
	}
	
	
	@Test(priority=2,enabled=true)
	public static void data_driven() throws InterruptedException {
		
		Assert.assertEquals(false, true);
		//logger=extent.startTest("data_driven");
	
//	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		 String Path="C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
//			
//			Xls_Reader obj=new Xls_Reader(Path);
//			int rowCount=obj.getRowCount("data");
//	for( int romNum=1; romNum<rowCount;romNum++) {
// WebElement calender_textbox=driver.findElement(By.xpath("//input[contains(@id,'AppointmentDate')]"));
//		 
//		 calender_textbox.click();
//		 String date=obj.getCellData_test("data", 0, romNum);
//		 System.out.println(date);
//		 String array[]=date.split("/");
////		 
//		 String day =array[0];
//		 String month= array[1];
//		 String year= array[2];
//		 
//		 List <WebElement>select2 = driver.findElements(By.xpath("//select[contains(@class,'ui-datepicker-year')]"));
//			
//		 for ( WebElement option:select2) {
//			 if(option.getText().equals(year)) {
//				 option.click();
//			 }
//			 
//		 }
//		 Select select1 = new  Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
////		 
//		 select1.selectByVisibleText(month);
//		 
////		 
//		 String BeforeXpath="//a[text()='";
//		 String AfterXpath="']";
//		 
//		 System.out.println(BeforeXpath+day+AfterXpath);
//		 // select date by usng custom xpath 
//		 driver.findElement(By.xpath(BeforeXpath+day+AfterXpath)).click();
//		 
//		 Thread.sleep(2000);
//		 String Actual_Time= obj.getCellData_test("data", 1, romNum);
//		 System.out.println(Actual_Time);
//		 //calender_textbox.clear();
//		 String BeforeAppt_Time="//*[@id=\"";
//			String AfterAppt_Time="m\"]"; 
////			String Actual_Time="830a";
////			obj.getCellData_test("data", "Time", romNum);
////			
//		 driver.findElement(By.xpath(BeforeAppt_Time+Actual_Time+AfterAppt_Time)).click();
////			
////			//adriver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
//		// Thread.sleep(2000);
//		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
//		 driver.findElement(By.id("DocLoginpassword")).sendKeys("KRs117743");
//		/// Thread.sleep(2000);
//		 driver.findElement(By.id("DoctorLogin")).click();
//	//	[text()='Search Patient']
////			 
//			 driver.findElement(By.xpath("//a[text()='Search Patient']")).click(); 
//			 String Patient_Id= obj.getCellData_test("data", 2, romNum);
//			 System.out.println(Patient_Id);
//			 driver.findElement(By.xpath("//input[@id='PatientID']")).sendKeys(Patient_Id);
//			 
//			 driver.findElement(By.xpath("//input[@value='Search']")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.xpath("//a[@title='Create Appointment']")).click();
//			 String cheif_comp= obj.getCellData_test("data", 3, romNum);
//			 System.out.println(cheif_comp);
//			 driver.findElement(By.xpath("//textarea[@id='ChiefComplaint']")).sendKeys(cheif_comp);
//			 
//			// Thread.sleep(2000);
//			 driver.findElement(By.xpath("//input[@value='Schedule']")).click();
//			 driver.findElement(By.xpath("//*[@id=\"BookingConformation\"]/div/div/div[3]/div/a[2]")).click();
//			 
//		} 
	}
	
	@AfterMethod 
	public void teardown() {
		
		//driver=null;
		driver.quit();
	}
	
	
	

}
