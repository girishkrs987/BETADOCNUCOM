package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
public static WebDriver driver ;
public static Properties porp;
public static void main(String[] args) {
	
	TestBase();
	
	
	
	intiliazation();
	
	//message();
}


	// TODO Auto-generated method stub
	


public static void TestBase() {
	
	try {
		
		porp=new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\Girish\\eclipse-workspace\\BETADOCNUCOM\\src\\main\\java\\Config\\config.properties");
		
		porp.load(ip);
	}
	
		catch(FileNotFoundException e){
		e.printStackTrace();
		
	}
		catch(IOException e) {
			
		e.printStackTrace();	
			
		}
		
	}

public static void intiliazation() {
	
	//String BrowserName =porp.getProperty("browser");
	
	
	///if(BrowserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		//}
//	else 
	// {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Girish\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		
		// driver=new FirefoxDriver();
	//	}
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//String data= porp.getProperty("Url");
	
	//System.out.println(data);
	driver.get("http://beta.docnu.com/");
	//driver.get(porp.getProperty("Url"));
	
	//driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/div[1]/nav/div/a[2]")).click();
	
}

public static void failed(WebDriver driver,String Methodname) throws IOException {
	
	
	// TakesScreenshot is a Interface which Indicates a driver that can capture a screenshot and store it in different ways.
	// OutputType is a interface which Defines the output type for a screenshot.
	// File - Obtain the screenshot into a temporary file that will be deleted once the JVM exits. 
	// and It is up to users to make a copy of this file
	//File is a class 
	
	// getScreenshotAs is a method - Capture the screenshot and store it in the specified location. 

	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	// FileUtils its a class which will be using to work with files and directories in Java. 
	//The examples read, write, copy, create, delete, list and get size of files.
	
	FileUtils.copyFile(screenshotFile, new File ("C:\\Users\\Girish\\eclipse-workspace\\Lead_Management\\Screen_Shots\\"+Methodname+"-"+".jpg"));
}

public static void message() {
	
	System.out.println("Test message");
}


}

