package Testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class date_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		// 	driver.get("file:///C:/Users/Girish/Desktop/window.html");
		driver.get("http://beta.docnu.com");
			
		Thread.sleep(2000);
//			
driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();
	 Thread.sleep(2000);
driver.findElement(By.id("UserName")).sendKeys("8310181488");
		
		driver.findElement(By.id("DocLoginpassword")).sendKeys("qweasdzxc");
//			 Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 
		 
			
		 Thread.sleep(2000);
			
		 driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		 String datevalue="9/Sep/2020";
		 
		 //String Appt_time= 11:00""
		 String date[]= datevalue.split("/");
		 
		 	String Day= date[0];
			String Month= date[1]; 
			String Year= date[2]; 
//			 
			Select  list1 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']"))); 
			
			list1.selectByVisibleText(Year);
			
		Select list2 = new Select( (WebElement) driver.findElement(By.xpath("//select[@data-handler='selectMonth']"))); 
		list2.selectByVisibleText(Month);
		
		 
		String BeforeXpath="//a[(text()='";
		String AfterXpath="')]";
		
		WebElement a=driver.findElement(By.xpath(BeforeXpath+Day+AfterXpath));
		 Thread.sleep(2000);
		 a.click();
		 
		//a[(text()='03')]
		
		
		
		//System.out.println(date.length);
		
//		for(int i=0; i<date.length;i++) {
//			
//			System.out.println(date[i]);
//		}
		
		
		
		
		 
		 
				 
				 
	}

}
