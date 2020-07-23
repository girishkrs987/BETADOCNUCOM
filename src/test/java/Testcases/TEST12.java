package Testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TEST12 {

	
	//package base.project;
	//import java.util.*;
	//import java.util.Scanner;
	//import javax.swing.*;
	
	//public class basefile1 {
	// public WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
	  
	System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://events.sbl1972.in/sbe/public/index.php");
	Thread.sleep(2000);

	driver.manage().window().maximize();
	//driver.find_element_by_id(“username”).send_keys(“super”);
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("super");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id='sumitlogin']")).click();
	 }
	}

