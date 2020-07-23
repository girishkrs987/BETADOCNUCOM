package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get("http://beta.docnu.com/");
			driver.get("http://beta.docnu.com/");
		 driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("UserName")).sendKeys("8310181488");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("qweasdzxc");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 


	}

}
