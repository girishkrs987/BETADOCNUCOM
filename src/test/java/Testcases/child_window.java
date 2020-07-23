package Testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window {

	
	public static WebDriver driver ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("file:///C:/Users/Girish/Desktop/window.html");
		
		driver.findElement(By.xpath("//input[@type='button']")).click();

		Set<String> List=	driver.getWindowHandles(); 
		

Iterator<String> it= List.iterator(); 

//while (it.hasNext()) {
	
	String ch_wndow1=it.next(); 
	String ch_wndow2=it.next();
	String ch_wndow3=it.next();
	String ch_wndow4=it.next();
	System.out.println(ch_wndow1);
	System.out.println(ch_wndow2);
	System.out.println(ch_wndow3);
	System.out.println(ch_wndow4);
	
	//WebDriver windowTitle=
			driver.switchTo().window(ch_wndow2);
	String windowTitle=driver.getCurrentUrl();
	
	System.out.println("title name "+windowTitle);
	
}



		
	//}

}
