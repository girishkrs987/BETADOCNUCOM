package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
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
		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Growth@2020");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu 

	
		String before_xpath ="//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
		
		String after_xpath ="]";;
		
		
		List<WebElement> list=	driver.findElements(By.xpath("//table[@id='DataTables_Table_0']"));
		
		int count= list.size(); 
		
		Utility.Xls_Reader obj= new Utility.Xls_Reader("C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx"); 
		
		for(int i =2; i<count; i++) {
			
						
	String actualpath= 	before_xpath+i+after_xpath;
	
	String patient_data= 	driver.findElement(By.xpath(actualpath)).getText();
	
	System.out.println(patient_data);
	
	obj.setCellData("Exportdata", "Data", i, patient_data);
		}
		
	
	
	}

}
