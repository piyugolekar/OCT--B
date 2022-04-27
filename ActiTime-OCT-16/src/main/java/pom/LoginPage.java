package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {    // same as encapsulation bcz use private use
	@FindBy (xpath = "//input[@id='username']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement  Password;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement  loginButton;
	
	@FindBy (xpath = "//label[@id='keepLoggedInLabel']")
	private WebElement  keepLoggedInLabel;

   public LoginPage(WebDriver driver123)   //consructor create nad driver123 create as reff
   {
	   PageFactory.initElements(driver123, this); // init use for initialized the value
   }
   
   public void sendUserName(String userId)  // method create 
   {
	   userName.sendKeys(userId);
   }
   
   public void sendPassword(String pass)//agar kiske change karna username pass wo to send argument krkrke kar skat ahei
   {
	   Password.sendKeys(pass);
   }
   
   public String getTextofloginButton() {
	   String text = loginButton.getText();
	   return text;
	   
   }
   
   public void clickOnLogin()
   {
	   loginButton.click();
   }
   
   public void keepLoggedInLabel()
   {
	   keepLoggedInLabel.click();
   }
   
   public void LoginToApplication()
   {
	   userName.sendKeys("admin");
	   Password.sendKeys("manager");
	   keepLoggedInLabel.click();
	   loginButton.click();
	   
   }
   
 }
