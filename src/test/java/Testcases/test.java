package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Xls_Reader;
import Utility.javascript;



public class test {
	public static  WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String Path="C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
		
		Xls_Reader obj=new Xls_Reader(Path);
		int rowCount=obj.getRowCount("data");
		
		for( int romNum=2; romNum<rowCount;romNum++) {
			
//		String date=obj.getCellData("data", "Date", romNum);
//		
//		
//		System.out.println(date);
			String date=obj.getCellData("data", "Date", romNum);
			System.out.println(date);
			String time=obj.getCellData_test("data", 2, romNum);
		//String time=obj.getCellData("data", "Time", romNum);
		System.out.println(time);
		
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://192.168.16.12/");
		

		// scrolldown of the page
		javascript obj1=new javascript();
		javascript.scroll();
		
		
		
	}

		
		
}
}