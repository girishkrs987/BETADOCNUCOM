package Testcases;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class usertypes_login {

	WebDriver driver;
	String credentails;
	String credentailsinfo[];
		// TODO Auto-generated method stub
		
		@BeforeMethod
		public  void setup() {
			
			 System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
      	   driver = new ChromeDriver ();
  		driver.manage().window().maximize();
  		driver.get("http://beta.docnu.com");
			
			
		}
		
		@Test(priority=1)
		public void Admin_Doctor() throws InterruptedException {
			 credentails=Data_hashmap.getuserlogin().get("9972921986");
			System.out.println(credentails);
			credentailsinfo=credentails.split("-");
			
			
			System.out.println(credentailsinfo.length);
			
			
			driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			// Thread.sleep(2000);
			 driver.findElement(By.id("UserName")).sendKeys(credentailsinfo[0]);
			 Thread.sleep(2000);
			 driver.findElement(By.id("DocLoginpassword")).sendKeys(credentailsinfo[1]);
			/// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("<span>Administration</span>")).click();
			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li/a")).click();
			 String actualtupe= driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div[2]/form/div/div[1]/div[1]/div/div/label")).getText();
			 String expectedtype= Data_hashmap.getusertypes().get(4);
				
				Assert.assertEquals(actualtupe, expectedtype);
		}
		
		@Test(priority=2,enabled=false)
		public void FrontOffice() throws InterruptedException {
			String credentails=Data_hashmap.getuserlogin().get("9480029104");
			credentailsinfo=credentails.split("-");
			
			driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			// Thread.sleep(2000);
			 driver.findElement(By.id("UserName")).sendKeys(credentailsinfo[0]);
			 Thread.sleep(2000);
			 driver.findElement(By.id("DocLoginpassword")).sendKeys(credentailsinfo[1]);
			/// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("<span>Administration</span>")).click();
			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li/a")).click();
			 String actualtupe= driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div[2]/form/div/div[1]/div[1]/div/div/label")).getText();
			 String expectedtype= Data_hashmap.getusertypes().get(4);
				
				Assert.assertEquals(actualtupe, expectedtype);
		}

		@Test(priority=3,enabled=false)
		public void LabTech() throws InterruptedException {
			String credentails=Data_hashmap.getuserlogin().get("9480029104");
			credentailsinfo=credentails.split("-");
			
			driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			// Thread.sleep(2000);
			 driver.findElement(By.id("UserName")).sendKeys(credentailsinfo[0]);
			 Thread.sleep(2000);
			 driver.findElement(By.id("DocLoginpassword")).sendKeys(credentailsinfo[1]);
			/// Thread.sleep(2000);
			 driver.findElement(By.id("DoctorLogin")).click();
			 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath("<span>Administration</span>")).click();
			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li/a")).click();
			 String actualtupe= driver.findElement(By.xpath("//*[@id=\"content\"]/div/section/div[2]/form/div/div[1]/div[1]/div/div/label")).getText();
			 String expectedtype= Data_hashmap.getusertypes().get(4);
				
				Assert.assertEquals(actualtupe, expectedtype);
		}
	

}
