package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import Pages.LoginPage;

public class actionsclass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	private Properties prop; 
	private FileInputStream ip; 
	
	
	private static String proppath="C:\\\\Users\\\\Girish\\\\eclipse-workspace\\\\BETADOCNUCOM\\\\src\\\\main\\\\java\\\\Config\\\\config.properties";
	//public static Actions action ; 
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream ip=new FileInputStream(proppath);
		
		prop.load(ip);
		
		
	TestBase.TestBase(); 
		//TestBase.intiliazation();
		
		LoginPage login= new LoginPage();
		
		login.VerifyLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		
		
//		System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		

//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.get("http://beta.docnu.com/");
//		
//		driver.get(prop.getProperty("Url"));
//		
		
		/*Thread.sleep(3000);	
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.id("UserName")).sendKeys("8310181488");
		driver.findElement(By.id("UserName")).sendKeys(prop.getProperty("Username"));
		Thread.sleep(3000);	
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("DocLoginpassword")))).sendKeys("qweasdzxc");
		driver.findElement(By.id("DocLoginpassword")).sendKeys(prop.getProperty("Password"));

		driver.findElement(By.id("DoctorLogin")).click();*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("<span>Administration</span>")).click();
		Actions action	= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li[5]/a"))).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[5]/ul/li[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"CustomFormName\"]")).sendKeys("Diabteic form");
		driver.findElement(By.xpath("//*[@id=\"btn_createform\"]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"btn_createform\"]")).click();
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"Image4\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"dvMyCtr\"]"))).release().build().perform();		
		driver.findElement(By.xpath("//*[@id=\"fbheadlbl_5\"]/span")).sendKeys("Pediatric form");
		
		
		

	}

}
