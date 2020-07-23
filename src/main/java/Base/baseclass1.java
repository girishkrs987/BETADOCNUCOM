package Base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass1 {
	
	public static WebDriver driver ;
	
	public static void intilaiztion() {
	//public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://beta.docnu.com/");
		
	}
	
	public void failed( String methodname) throws IOException {
		
		//(TakesScreenshot)driver.ge
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 FileUtils.copyFile(srcfile, new File("C:\\Users\\Girish\\eclipse-workspace\\BETADOCNUCOM\\test-output_Wednesday"+""+methodname+"-"+".jpg"));
		
		
	}

}
