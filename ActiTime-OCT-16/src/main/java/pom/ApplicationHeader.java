package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {
	
	 @FindBy (xpath = "//a[@class='content tt_selected selected']")
	 private WebElement TimeTracker;
	 
	 @FindBy (xpath = "//a[@class='content tasks']" )
	 private WebElement Task;
	 
	 @FindBy (xpath = "//a[@class='content reports']")
	 private WebElement Reports;
	 
	 @FindBy (xpath = "//a[@class='content users']")
	 private WebElement Users;
	 
	 @FindBy (xpath = "//a[@class='content calendar']")
	 private WebElement WorkSehedule;

	//create global var
	 private WebDriver driverABC; 
	//same agar dena hey wait to use global ko create kare
	 private WebDriverWait wait; 
	 private Actions actions;
	 public ApplicationHeader(WebDriver driver) {//constructor create//driver is a new reff var nd he doesnt call bcz it is llocal var so its use for global var save its local var
		PageFactory.initElements(driver, this);
        //driverABC = driver1;//type-1 to store data driver is global ban gaya
          driverABC = driver;	
          wait = new WebDriverWait(driver, 20);
          actions = new Actions(driver);
	}
	
	
	public void OpenTimeTracker() {
	 wait = new WebDriverWait(driverABC,20);
	 wait.until(ExpectedConditions.visibilityOf(TimeTracker));	
	 actions.moveToElement(TimeTracker).click().build().perform();
		TimeTracker.click();
		
	}
	
	public void openTask(){
		actions.moveToElement(Task).click().build().perform();
        Task.click();
		
	}
	public void openReports() {
		 wait.until(ExpectedConditions.visibilityOf(Reports));
		 actions.moveToElement(TimeTracker).click().build().perform();
		 Reports.click();
		
	}
	public void openUsers() {
		  wait = new WebDriverWait(driverABC,20);
	      wait.until(ExpectedConditions.visibilityOf(Users));
	      actions.moveToElement(TimeTracker).click().build().perform();
	      Users.click();
		
	}
	public void openWorkSehedule() {
		WorkSehedule.click();
		
	}
	
	}
	


