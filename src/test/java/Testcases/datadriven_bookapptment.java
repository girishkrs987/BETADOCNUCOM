package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sayem.util.XLData_reader;
import org.sayem.util.Xls_Reader;

public class datadriven_bookapptment {
	
	public static WebDriver driver ; 
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("http://beta.docnu.com/");
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
		
		driver.findElement(By.id("UserName")).sendKeys("9972921986");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.id("DocLoginpassword")).sendKeys("Growth@126");
		Thread.sleep(2000);
		driver.findElement(By.id("DoctorLogin")).click();
		
		
		// WebElement calender_textbox=driver.findElement(By.xpath("//input[contains(@id,'AppointmentDate')]"));
		 
		// calender_textbox.click();
		 
		 // String date = "9/Jun/2020"; 
		 
		 
//		 
//		 // split the date from forward slash and assigen into array varible.
//		 
//	 String array[]=date.split("/");
////		 
//	 String day =array[0];
//	 String month= array[1];
//	 String year= array[2];
		
	
	
	String path ="C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
	
	String sheetnamedata="data";
			
			
	Utility.Xls_Reader obj= new Utility.Xls_Reader(path); 
	
	
int count= 	obj.getRowCount(sheetnamedata);


for (int i=2; i<= count; i++) {

	String date =obj.getCellData("data", "Date", 2);
	String array[]=date.split("/");
//	 
String day =array[0];
String month= array[1];
String year= array[2];
	
	
	WebElement calender_textbox=driver.findElement(By.xpath("//input[@id='AppointmentDate']"));
	calender_textbox.click();
		// //*[@id="AppointmentDate"]
		
		Select year1 = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		
//		List<WebElement> listyear = year.getOptions();
//		System.out.println(listyear.size());
//		
//		Iterator<WebElement> itr = listyear.iterator();
//		
//		while(itr.hasNext()) {
//			WebElement years = itr.next();
//			System.out.println(years.getText());
//		}
//		
		year1.selectByVisibleText(year);
		
		Thread.sleep(2000);
		
		Select month1 = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month1.selectByVisibleText(month);
		 
		Thread.sleep(3000);
		//a[@class='ui-state-default' and contains(text(),'30')]
		//a[@class='ui-state-default' and contains(text(),'selectdate')]
		
		String beforexpath_date = "//a[@class='ui-state-default' and contains(text(),'";
		String afterxpath_date = "')]";
		//String date1 = selectdate;

		driver.findElement(By.xpath(beforexpath_date+day+afterxpath_date)).click();
		
		Thread.sleep(2000);
		
		// //a[@id='1145am']
		String beforetime ="//a[@id='";
		String aftertime = "m']";
		String times = obj.getCellData("data", "Time", 2);
		
		
		driver.findElement(By.xpath(beforetime+times+aftertime)).click();
		
		
	}

}}
