package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_color {
	public static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://beta.docnu.com");
		
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.id("UserName")).sendKeys("9972921986");
		Thread.sleep(2000);
		 driver.findElement(By.id("DocLoginpassword")).sendKeys("Monitha@@987");
		/// Thread.sleep(2000);
		 driver.findElement(By.id("DoctorLogin")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //String color = driver.findElement(By.xpath("//*[@id=\"1100am\"]")).getCssValue("color");
//		 WebElement element = driver.findElement(By.xpath("//*[@id=\"1100am\"]"));
//		 element.getCssValue("color");
		 
//		 JavascriptExecutor js=((JavascriptExecutor)driver);
//		 js.executeScript("arguments[0].style.background='", element.getCssValue("color") ); 
//		 
		 String text;
		  WebElement WebElement1 = driver.findElement(By.xpath("//*[@id=\"1100am\"]"));
		  text =WebElement1.getCssValue("background-color").toString();
		  
		  //System.out.println(text);
		//Split css value of rgb
		  String[] numbers = text.replace("rgb(", "").replace(")", "").split(",");
		  
		 // System.out.println(numbers);
		  int number1=Integer.parseInt(numbers[0]);
		  numbers[1] = numbers[1].trim();
		  int number2=Integer.parseInt(numbers[1]);
		  numbers[2] = numbers[2].trim();
		  int number3=Integer.parseInt(numbers[2]);
		  
		  System.out.println(number1+number2+number3);
		  String hex = String.format("#%02x%02x%02x", number1,number2,number3);
		  System.out.println(hex);
//		 String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
//		 
//		 int hexValue1=Integer.parseInt(hexValue[0]);
//		 hexValue[1] = hexValue[1].trim();
//		 int hexValue2=Integer.parseInt(hexValue[1]);
//		 hexValue[2] = hexValue[2].trim();
//		 int hexValue3=Integer.parseInt(hexValue[2]);
//		  
//		 String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
//System.out.println(text);
	}

}
