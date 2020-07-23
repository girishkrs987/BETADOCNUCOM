package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xapth_siblings {


	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			

//				wait= new WebDriverWait(driver,20);
			System.setProperty("webdriver.chrome.driver","C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://beta.docnu.com/");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-sm\']")).click();
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("UserName")).sendKeys("8310181488");
			Thread.sleep(3000);	
//				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("DocLoginpassword")))).sendKeys("qweasdzxc");
			driver.findElement(By.id("DocLoginpassword")).sendKeys("qweasdzxc");

			driver.findElement(By.id("DoctorLogin")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//i[contains(@class,'fa fa-share')]")).click(); // click om myreferrals menu

			driver.findElement(By.xpath("//a[@href = '/MyReferal/TodayReferal']")).click(); // clcik my referrals ubmneu
			driver.findElement(By.xpath("//a[text()='5']")).click();

			String patient_name="ram"; 
			driver.findElement(By.xpath("//td[contains(text(),'"+patient_name+"')] / following-sibling::td//a[contains(text(),'View')")).click();
			//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]
			//*[@id="DataTables_Table_0"]/tbody/tr[2]/td[3]

			/*	// print column and click on view button
			String patient_bxpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[";
			String patient_axpath = "]/td[3]";

			for (int i = 1; i <= 5; i++) {

			String var = driver.findElement(By.xpath(patient_bxpath + i + patient_axpath)).getText();
			if (var.contains(var)) {
			System.out.println(var);

			driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[" + i + "]/td[7]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ConfirmedLabReferalDetails\"]/div/div[2]/div[1]/button/span"))
			.click();
			Thread.sleep(3000);

			}
			} */
			// print particular name and click on view button
//				WebDriverWait wait= new WebDriverWait(driver, 20);

//			String p="ram";
//
//			// String pn = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+p+"]/td[3]")).getText();
//			String pn=driver.findElement(By.xpath("//td[text()="+p+"]")).getText();
//			if (pn.contains(p)) {
//			System.out.println(pn);
//			driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["++"]/td[7]/a")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+p+"]/td[7]/a"))));
//			driver.findElement(By.xpath("//*[@id=\"ConfirmedLabReferalDetails\"]/div/div[2]/div[1]/button/span"))
//			.click();

			}
	}


