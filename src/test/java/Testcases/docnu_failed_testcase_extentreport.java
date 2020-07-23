package Testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.Xls_Reader;

public class docnu_failed_testcase_extentreport {

	public static WebDriver driver; 
	public static ExtentReports extent;
	public static ExtentTest logger; 
	// how to add screenshot to the extent report for failed test cases 
	
	
@BeforeTest
public static void setExtent(){
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output_Wednesday/TestReport.html",true);
	
	System.out.println(System.getProperty("user.dir")+"/test-output/xyz.html");
	
	extent.addSystemInfo("Host Name", "Girish");
	extent.addSystemInfo("User name", "Girish");
	extent.addSystemInfo("Environment", "QA");
	extent.addSystemInfo("Platform", "Windows");
	
	}
	

	
	@BeforeMethod
	public static void Setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://docnu.com");
	}
	
	
	@Test(priority=1,enabled=false)
	public  void verifylogin() {
		
		logger=extent.startTest("verifylogin"); 
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			// Thread.sleep(2000);
			 driver.findElement(By.id("UserName")).sendKeys("9972921986");
			 driver.findElement(By.id("DocLoginpassword")).sendKeys("KRs117743");
			/// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
				//Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']123")).click(); // clcik my referrals ubmneu 

	}
	
	@Test(priority=2,enabled=true)
	public static void data_driven() throws InterruptedException {
		
		logger=extent.startTest("data_driven");
	
	 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("KRs117743");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 String Path="C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
			
			Xls_Reader obj=new Xls_Reader(Path);
			int rowCount=obj.getRowCount("data");
	for( int romNum=1; romNum<rowCount;romNum++) {
 WebElement calender_textbox=driver.findElement(By.xpath("//input[contains(@id,'AppointmentDate')]"));
		 
		 calender_textbox.click();
		 String date=obj.getCellData_test("data", 0, romNum);
		 System.out.println(date);
		 String array[]=date.split("/");
//		 
		 String day =array[0];
		 String month= array[1];
		 String year= array[2];
		 
		 List <WebElement>select2 = driver.findElements(By.xpath("//select[contains(@class,'ui-datepicker-year')]"));
			
		 for ( WebElement option:select2) {
			 if(option.getText().equals(year)) {
				 option.click();
			 }
			 
		 }
		 Select select1 = new  Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
//		 
		 select1.selectByVisibleText(month);
		 
//		 
		 String BeforeXpath="//a[text()='";
		 String AfterXpath="']";
		 
		 System.out.println(BeforeXpath+day+AfterXpath);
		 // select date by usng custom xpath 
		 driver.findElement(By.xpath(BeforeXpath+day+AfterXpath)).click();
		 
		 Thread.sleep(2000);
		 String Actual_Time= obj.getCellData_test("data", 1, romNum);
		 System.out.println(Actual_Time);
		 //calender_textbox.clear();
		 String BeforeAppt_Time="//*[@id=\"";
			String AfterAppt_Time="m\"]"; 
//			String Actual_Time="830a";
//			obj.getCellData_test("data", "Time", romNum);
//			
		 driver.findElement(By.xpath(BeforeAppt_Time+Actual_Time+AfterAppt_Time)).click();
//			
//			//a[text()='Search Patient']
//			 
			 driver.findElement(By.xpath("//a[text()='Search Patient']")).click(); 
			 String Patient_Id= obj.getCellData_test("data", 2, romNum);
			 System.out.println(Patient_Id);
			 driver.findElement(By.xpath("//input[@id='PatientID']")).sendKeys(Patient_Id);
			 
			 driver.findElement(By.xpath("//input[@value='Search']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[@title='Create Appointment']")).click();
			 String cheif_comp= obj.getCellData_test("data", 3, romNum);
			 System.out.println(cheif_comp);
			 driver.findElement(By.xpath("//textarea[@id='ChiefComplaint']")).sendKeys(cheif_comp);
			 
			// Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@value='Schedule']")).click();
			 driver.findElement(By.xpath("//*[@id=\"BookingConformation\"]/div/div/div[3]/div/a[2]")).click();
			 
		} 
			 
		 
	}
	
	@AfterTest
	public static void endreport() {
		extent.flush();
		extent.close();
		
		
	}
	
	// this meythod for capture sccrenshots of the failes testcases 
	
	public static String getScreenshot(WebDriver driver, String Screennshotname) throws IOException {
		
		String date= new SimpleDateFormat("YYYYMMDDHHMMSS").format(new Date()); 
		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		
		File screenshotFile =ts.getScreenshotAs(OutputType.FILE);
		
		String destination= (System.getProperty("user.dir")+"/Failed_Testcase_Output/"+Screennshotname+date+".png");
		
		File finaldestination= new File(destination); 
		
		FileUtils.copyFile(screenshotFile,finaldestination);
		return destination;
		
		
		
		
		//FileUtils.copyFile(screenshotFile, new Filstatice ("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\Screen_Shots\\"+Methodname+"-"+".jpg"));
	}
	
	
	//public static void Test Reports 
	
	@AfterMethod
	public static void teardown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
		
			logger.log(LogStatus.FAIL, "Test case has failed"+result.getName());
			logger.log(LogStatus.FAIL, "Test case has failed"+result.getThrowable());
			
					String  screenshotpath=getScreenshot(driver, result.getName()); 
					logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotpath));				
					
		}
					else {
						
						logger.log(LogStatus.SKIP, "Test case has skipped"+result.getName());
						logger.log(LogStatus.SKIP, "Test case has skipped"+result.getThrowable());
					}
					
					{
						logger.log(LogStatus.PASS, "Test case has passed"+result.getName());
						logger.log(LogStatus.PASS, "Test case has passed"+result.getThrowable());
					}	
					
					extent.endTest(logger);
driver.quit();					
		}
		
		
	

	
	
}
