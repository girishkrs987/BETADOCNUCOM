package Testcases;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseclass1;

public class test11 {
	
	
 private  WebDriver driver  ;
	
	@BeforeClass 
	public void setup() {
		
		//baseclass1.intilaiztion();
		
		System.out.println("before method");
		baseclass1.intilaiztion();
		
	}

	@Test
	public void Test1() {
		
		try {
		System.out.println("test1 message");
		
		driver.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
//	@Test
//	public void Test2() {
//		
//		System.out.println("test2 message");
//	}
	
	@AfterClass 
	public void teardown() {
		
		//driver=null;
	try {
		
		System.out.println("after method");
		
	}
	
	catch (Exception e) {
		
		
	}
//	finally {
//		//driver.close();
//		driver.close();
//		driver.quit();
//	}
	}
	
			
			
		}
	


