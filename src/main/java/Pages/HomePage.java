package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase{
	// extends TestBase
	
  WebDriver driver;
	
	//driver=new Chromedriver(); 
	// define page factory 
	
	
	
	 
		 @FindBy(xpath="//a[@class='btn btn-primary btn-sm']")
	     public static WebElement DoctorUser ;
		 
		 
		 
		 @FindBy(xpath="//*[@id='UserName']")
		 WebElement username  ;
		 
		 @FindBy(xpath="//*[@id=DocLoginpassword']")
		 WebElement password  ;
		 
		 @FindBy(xpath="//*[@id='DoctorLogin']")
		 WebElement logonbutton  ;
		 
		
		//@FindBy(className="input[class='form-control'][name='UserName']")
		 
//		  webelement doctor loginbutton 
//		@FindBy(id="UserName")
//		
		
	// webelement of Administration menu
	
	@FindBy(linkText="Administration")
    WebElement Administration_Menu ;
    
	
	
	@FindBy(xpath="//span[contains(text(),'Manage Referrals')]")
	WebElement Manage_Referrals_menu; 
	
	@FindBy(xpath="//a[contains(text(),'My Referrals')]")
	WebElement My_Referrals_sub_menu;
	
	
	
	String BeforeXapth="//td[contains(text(),'";
	String AfterXapth="')] /following-sibling::td//a[contains(text(),'View')]";
	String Patientname="Ravichandran";
	
	@FindBy(xpath="BeforeXapth+Patientname+AfterXapth")
	WebElement patientdate_in_record;
	
	
	//td[contains(text(),'Ravichandran')] /following-sibling::td//a[contains(text(),'View')]
	

	//*[@id="navigation"]/li[5]/a/span
	@FindBy(xpath="//*[@id=\"navigation\"]/li[5]/ul/li[10]/a")
    WebElement Calender_settings ;
	
	@FindBy(xpath="//input[@id='txtpatientid']")
    WebElement SearchPatient_ID ;
	
	@FindBy(xpath="//button[@id='btnpatientsearch']")
    WebElement SearchButton ;
	
	String BeforeAppt_Time="//*[@id=\"";
	String AfterAppt_Time="m\"]"; 
			
	
	@FindBy(xpath="//button[@id='btnpatientsearch']")
    WebElement Appt_Time ;
	
	@FindBy(xpath="//h1[@class='main_title']")
    WebElement Landingpage_text ;
	
	//*[@id="content"]/div/div[2]/div/div/h1
	//*[@id="830am"]
	
    
		  public HomePage() {
	    	
	    	intiliazation();
	    	//driver=TestBase.driver;
	    	PageFactory.initElements(driver, this);
	    }

		  public  String loginfunction( String un,String Pwd) {
			  
			  DoctorUser.click();
			  username.sendKeys(un);
			  password.sendKeys(Pwd);
			  logonbutton.click();
			String var=  Landingpage_text.getText();
			  
			  
			return var;
			  
			  
		  }
		  
		  
		  
	  public void Administration_Menu_Click() {
		  
		  Administration_Menu.click();
		   Administration_Menu.getText();
		   
		   
		   
		   	  
		  
	  }
	  
	  public  void search_patient(String patientid) {
		  
		  SearchPatient_ID.sendKeys(patientid);
		  SearchButton.click();
		  
	  }
	  
	  
}
