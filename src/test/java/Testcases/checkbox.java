package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class checkbox {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// When multiple checkboxes are there how do you check which one is checked previously?
		
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		
		 driver = new ChromeDriver ();
		driver.manage().window().maximize();
		// 	driver.get("file:///C:/Users/Girish/Desktop/window.html");
		driver.get("file:///C:/Users/Girish/Desktop/chkbox.html");
		
		//chk(element1);
		
		WebElement element1=driver.findElement(By.xpath("//input[@id='scales']"));
		WebElement element2=driver.findElement(By.xpath("//input[@id='horns']"));
		WebElement element3=driver.findElement(By.xpath("//input[@id='Male']"));
		WebElement element4=driver.findElement(By.xpath("//input[@id='Female']"));
		WebElement element5=driver.findElement(By.xpath("//input[@id='3rdgender']"));
		
		WebElement elements[] = {element2, element1,element3};
		chk(elements);
		
		
		
	}
	private static void chk(WebElement...elements) {
		
		WebElement checkElement = null;
	
		
		
		for (WebElement currentElement : elements) {
			checkElement = currentElement;
			
			WebElement checkBox = currentElement;
			
			if (checkBox.isSelected())
				//System.out.println("CheckBox " + currentElement
					//	+ " is already selected");
				System.out.println(currentElement+"checkbox selected");	
				
			else
				System.out.println(currentElement+"checkbox not selected");
		}

		}
	

}
