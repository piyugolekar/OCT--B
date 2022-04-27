import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;

public class TestClass1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage = new LoginPage(driver);
	
		String logintext = loginPage.getTextofloginButton(); //login button ka text len ahey to
		if (logintext.equals("loginButton"))
		{
			System.out.println("text is pass");
		}
		else
		{
			System.out.println("text is fail");
		}
		
	
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.clickOnLogin();
		loginPage.keepLoggedInLabel();
		//chroemdriver data driver mey save kiya use abhi yaha pass kiya
		
		ApplicationHeader header =  new ApplicationHeader(driver);
		header.openReports();
		
	}
}
