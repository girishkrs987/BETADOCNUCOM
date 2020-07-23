package Testcases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Xls_Reader;

public class data_diven_test {

	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://beta.docnu.com");
		//driver.get("https://docnu.com");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("UserName")).sendKeys("9972921986");
		Thread.sleep(3000);	
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("DocLoginpassword")))).sendKeys("qweasdzxc");
		driver.findElement(By.id("DocLoginpassword")).sendKeys("Monitha@@987");

		driver.findElement(By.id("DoctorLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		// book appointmnet 
		
		// 28/May/2019
		
		//String date="2/Aug/2019";
		
		String Path="C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
		
		Xls_Reader obj=new Xls_Reader(Path);
		int rowCount=obj.getRowCount("data");
		
		obj.addColumn("data", "Status");
		for( int romNum=2; romNum<rowCount;romNum++) {
			
		//String date=obj.getCellData("data", "Date", romNum);
		//String date=obj.getCellData_test("data", "Date", romNum);
		
		
		//System.out.println(date);
		//obj.getCellData("data", colName, rowNum); 
		 WebElement calender_textbox=driver.findElement(By.xpath("//input[contains(@id,'AppointmentDate')]"));
		 
		 calender_textbox.click();

		 
		 
	//String date = obj.getCellData("data", "Date", romNum);
	 
	 //Date date1=new SimpleDateFormat("dd/MMM/yyyy").parse(Date);  
	 
	// System.out.println(date1);
//		 
//split the date from forward slash and assigen into array varible.
//		 
		// String date=obj.getCellData_test("data", 0, romNum);
		 String date= obj.getCellData("data", "Date", romNum);
		 System.out.println(date);
		 String array[]=date.split("/");
//		 
		 String day =array[0];
		 String month= array[1];
		 String year= array[2];
//		 
//		 // month dropdown control 
		
		 // Year dropdown control 
		 
		 
		 Select select2=new Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		select2.selectByVisibleText(year);
		 
		 
		 // this is another approach for select value from dropdown 
		 
//		 List <WebElement>select2 = driver.findElements(By.xpath("//select[contains(@class,'ui-datepicker-year')]"));
//		
//		 for ( WebElement option:select2) {
//			 if(option.getText().equals(year)) {
//				 option.click();
//			 }
//			 
//		 }	
//		
		 
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
		// String Actual_Time= obj.getCellData_test("data", 1, romNum);
		 String Actual_Time= obj.getCellData("data", "Time", romNum);
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
			// String Patient_Id= obj.getCellData_test("data", 2, romNum);
			 String Patient_Id= obj.getCellData("data", "Patient Id", romNum);
			 System.out.println(Patient_Id);
			 driver.findElement(By.xpath("//input[@id='PatientID']")).sendKeys(Patient_Id);
			 
			 driver.findElement(By.xpath("//input[@value='Search']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[@title='Create Appointment']")).click();
			// String cheif_comp= obj.getCellData_test("data", 3, romNum);
			 String cheif_comp= obj.getCellData("data", "Chief compaliant", romNum);
			 System.out.println(cheif_comp);
			 driver.findElement(By.xpath("//textarea[@id='ChiefComplaint']")).sendKeys(cheif_comp);
			 
			// Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@value='Schedule']")).click();
			 
			 
			 String confrmsg=driver.findElement(By.xpath("//*[@id=\"BookingConformation\"]/div/div/div[2]/h5[1]")).getText();
			
			// System.out.println(confrmsg);
			 driver.findElement(By.xpath("//*[@id=\"BookingConformation\"]/div/div/div[3]/div/a[2]")).click();
			 
			 if(confrmsg.equals(confrmsg)) {
			 
			 obj.setCellData("data", "Status", romNum, "Appointment has confirmed"); 
			 }
			 //else 
			 
			 obj.setCellData("data", "Status", romNum, "Fail");
		}
		
		
		
			 
		 

	}
	
		
}
