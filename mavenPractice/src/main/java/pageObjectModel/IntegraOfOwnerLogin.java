package pageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegraOfOwnerLogin {

	WebDriver driver;
	By userName = By.name("txtEmail");
	By password = By.name("txtPassword");
	By Button  = By.name("btnsubmit");
		
	public IntegraOfOwnerLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void actionperform() {
		Actions o = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Owner-G"));
		o.moveToElement(ele).build().perform();
		driver.findElement(By.partialLinkText("Login")).click();
	}
	public void EnterUserName(String arg) {
		driver.findElement(userName).sendKeys(arg);
	}
	public void EnterPassword(String arg) {
		driver.findElement(password).sendKeys(arg);
	}
	public void Enterbutton() {
		driver.findElement(Button).click();
}
	
	
}
