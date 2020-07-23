package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class LoginPage extends TestBase{

	public static void main(String[] args) {
		LoginPage obj= new LoginPage();
		
		TestBase Test; 
		
		//obj.VerifyLogin(un, pwd)
		obj.VerifyLogin("9964617093", "&CnyRg9q");
	}
	
	//private static final String xpath = null;


	  static WebDriver driver;
	
	
	// define page factory 
	 
	 @FindBy(xpath="//a[@class='btn btn-primary btn-sm']")
	static
     WebElement DoctorUser ;
	 
	//@FindBy(className="input[class='form-control'][name='UserName']")
	@FindBy(id="UserName")
	static
	
	WebElement username ; 
	
    @FindBy(id="DocLoginpassword")
	static
	
	WebElement password ; 
	

    @FindBy(xpath="//*[@id=\"DoctorLogin\"]")
	static

    WebElement DrLoginbtn ; 

    
    
    public   LoginPage() {
    	
    	intiliazation();
    	driver=TestBase.driver;
    	PageFactory.initElements(driver, this);
    }
    
    // actions
    
    public String verifymessage(){
    	
    	//DoctorUser.click();
    	
    	System.out.println("DOC&U Portal");
    	
    	try {
    	 DoctorUser=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']"));
    	}
    	catch(Exception e){
    		System.out.println("driver not found");
    	}
    	
    	DoctorUser.click();
    	
    	return DoctorUser.getText(); 
    	
    	
    	
    }
    
    
   public   HomePage VerifyLogin(String un, String pwd) {
    	
    	 DoctorUser.click();
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   username.sendKeys(un);
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   password.sendKeys(pwd);
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	DrLoginbtn.click();
    	
    	
       	return new HomePage();  // its return home page object 
    	
    }
    
}


